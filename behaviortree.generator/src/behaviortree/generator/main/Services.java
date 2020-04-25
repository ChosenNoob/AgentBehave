package behaviortree.generator.main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import behaviortree.BehaviorTree;
import behaviortree.EntryPoint;

public class Services {
	public String generateGridCode(BehaviorTree behaviorTree) {
		String gridCode = "";

		String projectName = getProjectName(behaviorTree);
		
		// Package 		
		gridCode += "package " + projectName + "\n";
		gridCode += "\n";
		
		// Imports
		gridCode += "import repast.simphony.context.Context;" + "\n";
		gridCode += "import repast.simphony.context.space.grid.GridFactory;" + "\n";
		gridCode += "import repast.simphony.context.space.grid.GridFactoryFinder;" + "\n"; 
		gridCode += "import repast.simphony.dataLoader.ContextBuilder;" + "\n";
		gridCode += "import repast.simphony.random.RandomHelper;" + "\n";
		gridCode += "import repast.simphony.space.grid.Grid;" + "\n";
		gridCode += "import repast.simphony.space.grid.GridBuilderParameters;" + "\n";
		gridCode += "import repast.simphony.space.grid.SimpleGridAdder;" + "\n";
		gridCode += "import repast.simphony.space.grid.WrapAroundBorders;" + "\n";
		gridCode += "\n";
		
		// Class Body
		gridCode += "public class " + projectName + " implements ContextBuilder<Object> {" + "\n";
		gridCode += "\n";
		
		// build method open
		gridCode += "	public Context build(Context<Object> context) {" + "\n";
		
		// Grid creation
		gridCode += "		context.setId(\"" + projectName + "\");" + "\n";
		gridCode += "\n";
		gridCode += "		Grid<Object> grid = gridFactory.createGrid(\"grid\", context," + "\n";
		gridCode += "				new GridBuilderParameters<Object>(new WrapAroundBorders()," + "\n";
		gridCode += "						new SimpleGridAdder<Object>(), false, " + behaviorTree.getGridLength() + ", " + behaviorTree.getGridHeight() + "));" + "\n";
		gridCode += "\n";
		for (EObject child: filter(behaviorTree, "EntryPoint")) {
			EntryPoint entryPoint = (EntryPoint) child;
			String agentClassName = getClassName(entryPoint);
			String agentVarName = getVarName(entryPoint);
			List<int[]> agentPositions = getAgentPositions(entryPoint);
				
			// Agent Positions
			gridCode += "		int[][] " + agentVarName + "AgentPos = {" + "\n";
			for (int[] pos: agentPositions) {
				gridCode += "			{" + pos[0] + ", " + pos[1] + "}" + "\n";
			}
			gridCode += "		}" + "\n";
			
			// Agent Placement
			gridCode += "		for (int[] pos : " + agentVarName + "AgentPos) {" + "\n";
			gridCode += "			" + agentClassName + " agent = new " + agentClassName + "(grid);" + "\n";
			gridCode += "			context.add(agent);" + "\n";
			gridCode += "			grid.moveTo(agent, pos[0], pos[1]);" + "\n";
			gridCode += "		}" + "\n";
			gridCode += "\n";
			
			
		}
		
		// build method close
		gridCode += "		return context;" + "\n";
		gridCode += "	}" + "\n";
		
		// Class Body Close
		gridCode += "}" + "\n";
		
		return gridCode;
	}
	
	public List<EObject> filter(EObject parent, String eClassName)
	{
		List<EObject> filteredChildren = new ArrayList<EObject>();
		for (EObject child : parent.eContents()) {
			if (child.eClass().getName() == eClassName) {
				filteredChildren.add(child);
			}
		}
		return filteredChildren;
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
		return newStr;
	}	
	
	public String getVarName(EntryPoint entryPoint)
	{
		char[] charArr = entryPoint.getAgentName().toCharArray();
		charArr[0] = Character.toLowerCase(charArr[0]);
		String newStr = String.valueOf(charArr);
		return newStr;
	}
	
	public List<int[]> getAgentPositions(EntryPoint entryPoint) {
		List<int[]> agentPos = new ArrayList<int[]>();
		
		String[] positionStringArray= entryPoint.getAgentPositions().split(",");
		for (String posString: positionStringArray) {
			int[] pos= new int[2];
			pos[0] = Integer.parseInt(posString.split(":")[0]);
			pos[1] = Integer.parseInt(posString.split(":")[1]);
			agentPos.add(pos);
		}
		return agentPos;
	}
	public String getXCoor(EntryPoint entryPoint, int index)
	{
		String[] coordinateArray = entryPoint.getAgentPositions().split(",");
		return coordinateArray[index].split(":")[0];
	}
	
	public String getYCoor(EntryPoint entryPoint, int index)
	{
		String[] coordinateArray = entryPoint.getAgentPositions().split(",");
		return coordinateArray[index].split(":")[1];
	}
//	public Set<Set<int>> getAgentCoordinateSet(EntrtPoint entryPoin)
//	{
//		return null;
//	}
	public Integer[] test() {
		Integer[] dummy = {1,2,3,4};
		return dummy;
	}
}
