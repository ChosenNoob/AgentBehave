Download Eclipse from https://www.eclipse.org/downloads/packages/release/2019-06/r/eclipse-ide-eclipse-committers

Install Sirius and EcoreTools from Eclipse Marketplace (Sirius resides in Obeo section, EcoreTools resides in Eclipse section)

After downloading and installing packages, select your Eclipse Workspace as .../49x-agentbehave/eclipse-workspace/

To use metamodel, run the metamodel as an Eclipse instance. It uses .../49x-agentbehave/runtime-EclipseApplication/ as its workspace.

*The following files should reside in eclipse-workspace:*

behaviorTreeMetamodel -> **Last version of metamodel implemented in Sirius**

behaviorTreeMetamodel.edit -> Generated from behaviorTreeMetamodel (maybe we should add it to .gitignore)

behaviorTreeMetamodel.editor -> Generated from behaviorModel (maybe we should add it to .gitignore)

*The following files should reside in runtime-EclipseApplication:* (.design can reside in -workspace / a matter of choice)

behaviorTreeSample -> **An example model**

behaviorTreeMetamodel.design -> **Current viewpoint specification project** 