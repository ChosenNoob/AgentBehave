package behaviortree.generator.main;

import behaviortree.BehaviorTree;

public class Services {
	public String generate(BehaviorTree behaviortree){
		String generatedCode;
		generatedCode = behaviortree.getModelPath();
		return generatedCode;
	}
}
