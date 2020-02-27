Folder descriptions:

*The following files should reside in eclipse-workspace:*

behaviorTreeMetamodel -> **Last version of metamodel implemented in Sirius**

behaviorTreeMetamodel.edit -> Generated from behaviorTreeMetamodel (maybe we should add it to .gitignore)

behaviorTreeMetamodel.editor -> Generated from behaviorModel (maybe we should add it to .gitignore)

*The following files should reside in runtime-EclipseApplication:* (.design can reside in -workspace / a matter of choice)

behaviorTreeSample -> **An example model**

behaviorTreeMetamodel.design -> **Current viewpoint specification project**



BehaviorTreeExport.zip -> Packaged version of metaModel. Acceleo needs this package installed in order to generate from metamodel

BehaviorTreeFeatureProject -> Feature Project for metamodel (required for generating BehaviorTreeExport.zip)

BehaviorTreeUpdateSiteProject -> UpdateSite Project for metamodel (required for generating BehaviorTreeExport.zip)

BehaviorTreeModellingProject -> An example BehaviorTree model (used by acceleo) **Requires update**

BehaviorTreeAcceleoProject -> Acceleo Project for generation (requires installing BehaviorTreeExport.zip to another eclipse instance)