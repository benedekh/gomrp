package hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui.handler;

import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class GenerationHandler extends AbstractHandler implements IHandler {

	@Inject
	private IGenerator generator;

	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;

	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile) {
				IFile file = (IFile) firstElement;
				IProject project = file.getProject();
				IFolder srcGenFolder = project.getFolder("src-gen");
				if (!srcGenFolder.exists()) {
					try {
						srcGenFolder.create(true, true, new NullProgressMonitor());
					} catch (CoreException e) {
						return null;
					}
				}
				URI uri = URI.createPlatformResourceURI(file.getFullPath()
						.toString(), true);
				final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider
						.get();
				ResourceSet rs = resourceSetProvider.get(project);
				Resource res = rs.getResource(uri, true);
				generator.doGenerate(res, fsa);
			}
		}

		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		IFile file = (IFile) activeEditor.getEditorInput().getAdapter(
				IFile.class);
		if (file != null) {
			IProject project = file.getProject();
			IFolder srcGenFolder = project.getFolder("src-gen");
			if (!srcGenFolder.exists()) {
				try {
					srcGenFolder.create(true, true, new NullProgressMonitor());
				} catch (CoreException e) {
					return null;
				}
			}
			final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider
					.get();
			// fsa.setOutputPath(srcGenFolder.getFullPath().toString());

			if (activeEditor instanceof XtextEditor) {
				((XtextEditor) activeEditor).getDocument().readOnly(
						new IUnitOfWork<Boolean, XtextResource>() {

							@Override
							public Boolean exec(XtextResource state)
									throws Exception {
								generator.doGenerate(state, fsa);
								return Boolean.TRUE;
							}
						});
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}