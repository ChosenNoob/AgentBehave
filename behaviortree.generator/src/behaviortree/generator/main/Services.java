package behaviortree.generator.main;

import java.nio.file.Path;
import java.nio.file.Paths;

import behaviortree.BehaviorTree;
import behaviortree.EntryPoint;

public class Services {
	public String generate(BehaviorTree behaviortree){
		String generatedCode;
		generatedCode = "";
		return generatedCode;
	}
	public String getProjectName(BehaviorTree behaviorTree){
		Path projectPath = Paths.get(behaviorTree.getProjectPath());
		return projectPath.getFileName().toString();
	}
	public String getClassName(EntryPoint entryPoint)
	{
		char[] charArr = entryPoint.getAgentName().toCharArray();
		charArr[0] = Character.toUpperCase(charArr[0]);
		String newStr = String.valueOf(charArr);
//		System.out.println(str);
		return newStr;
	}
}
