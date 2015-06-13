Go Model Railway Project
==============================

What is it?
-----------

It is a simple DSL for model railway domain created at the Fault Tolerant Systems Research Group (http://www.inf.mit.bme.hu/en) at the Budapest University of Technology and Economics. It was developed as a homework for the course "Model Driven Software Development" by Benedek Horváth, Raimund-Andreas Konnerth, Tamás Nádudvari. It can be used to create model railway tracks, specify their behavior with StateMachine language, and simulate (or generate simulation code from) them.

Technologies used
-----------------

* Eclipse Modeling Tools 4.4.2
* EMF IncQuery 0.9.1
* Xtext Complete IDE 2.7.3
* Xtend IDE 2.7.3
* Sirius – 2.0
* e(fx)clipse IDE – 1.2

How to use it
-------------

Clone the repository, a detailed guide can be found in the root directory.

How much time it took
---------------------

The homework was done in 3 phases. The presentation about each phase can be found in hu.bme.mit.inf.gomrp.presentations project. The following table shows our work hours in each phase.

| Name                     | Phase 1 | Phase 2 | Phase 3 | Total |
|--------------------------|---------|---------|---------|-------|
| Benedek Horváth          |      18 |      17 |      26 |    61 |
| Raimund-Andreas Konnerth |      17 |      16 |      27 |    60 |
| Tamás Nádudvari          |      16 |      18 |      23 |    57 |

Roadmap
-------

Extension plans:
* Iteratively build the Traceability model during code generation (the metamodel has already been designed with additional IncQuery constraints).
* Extend the TraceVisualizer to handle other track layouts as well.

Related projects
----------------

* Pineapple Dataflow Net Modeler - a homework for the same MDSD course last year (a Dataflow Net Modeler tool, http://github.com/hajduakos/PineappleDataflowNet).