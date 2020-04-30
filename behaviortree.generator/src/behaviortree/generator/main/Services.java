package behaviortree.generator.main;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import behaviortree.BehaviorTree;
import behaviortree.BehaviortreePackage;
import behaviortree.EntryPoint;
import behaviortree.Node;
import behaviortree.impl.BehaviortreeFactoryImpl;
import behaviortree.impl.BehaviortreePackageImpl;

public class Services {
	
	public String generateGridCode(BehaviorTree behaviorTree) {
		try {
			PriorityDetector.setNodeCoors(behaviorTree);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String gridCode = "";

		String projectName = getProjectName(behaviorTree);
		
		// Package 		
		gridCode += "package " + projectName + ";" + "\n";
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
		gridCode += "public class GridGoL implements ContextBuilder<Object> {" + "\n";
		gridCode += "\n";
		
		// build method open
		gridCode += "	public Context build(Context<Object> context) {" + "\n";
		
		// Grid creation
		gridCode += "		context.setId(\"" + projectName + "\");" + "\n";
		gridCode += "\n";
		gridCode += "		GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);" + "\n";
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
			if (agentPositions.size() != 0) {
				for (int i = 0; i < agentPositions.size() - 1; i++) {
					gridCode += "			{" + agentPositions.get(i)[0] + ", " + agentPositions.get(i)[1] + "}," + "\n";
				}
				gridCode += "			{" + agentPositions.get(agentPositions.size() - 1)[0] + ", " + agentPositions.get(agentPositions.size() - 1)[1] + "}" + "\n";
					
			}
			gridCode += "		};" + "\n";
			// Agent Placement
			gridCode += "		for (int[] pos : " + agentVarName + "AgentPos) {" + "\n";
			gridCode += "			" + agentClassName + " agent = new " + agentClassName + "(grid);" + "\n";
			gridCode += "			agent.x = pos[0]; agent.y = pos[1];" + "\n";
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
	
	public String generateAgentBaseClass(BehaviorTree behaviorTree)
	{
		String gridCode = "";

		String projectName = getProjectName(behaviorTree);
		
		// Package 		
		gridCode += "package " + projectName + ";" + "\n";
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
		gridCode += "public class Agent {" + "\n";
		gridCode += "" + "\n";
		
		// Properties		
		gridCode += "	public Grid<Object> grid;" + "\n";
		gridCode += "	public int x;" + "\n";
		gridCode += "	public int y;" + "\n";
		gridCode += "" + "\n";
		
		// Constructor
		gridCode += "	public Agent(Grid<Object> grid) {" + "\n";
		gridCode += "		this.grid = grid;" + "\n";
		gridCode += "	}" + "\n";
		
		// Class Body Close
		gridCode += "}" + "\n";
		
		return gridCode;
	}
	
	public String generateAgentCode(EntryPoint entryPoint)
	{
		String agentCode = "";

		String projectName = getProjectName((BehaviorTree) entryPoint.eContainer());
		String agentClassName = getClassName(entryPoint); 
		// Package 		
		agentCode += "package " + projectName + ";" + "\n";
		agentCode += "\n";
		
		// Imports
		agentCode += "import repast.simphony.context.Context;" + "\n";
		agentCode += "import repast.simphony.engine.schedule.ScheduledMethod;" + "\n";
		agentCode += "import repast.simphony.query.space.grid.MooreQuery;" + "\n"; 
		agentCode += "import repast.simphony.space.grid.Grid;" + "\n";
		agentCode += "import repast.simphony.space.grid.GridPoint;" + "\n";
		agentCode += "import repast.simphony.util.ContextUtils;" + "\n";
		agentCode += "\n";
		
		// Class Body
		agentCode += "public class " + agentClassName + " extends Agent {" + "\n";
		agentCode += "\n";
		
		// Constructor
		agentCode += "	public " + agentClassName + "(Grid<Object> grid) {" + "\n";
		agentCode += "		super(grid);" + "\n";
		agentCode += "	}" + "\n";
		agentCode += "" + "\n";
		
		genNodeCode(entryPoint);
		
		// Class Body Close
		agentCode += "}" + "\n";
		
		return agentCode;
	}
	
	public String genNodeCode(Node node)
	{
		EList<Node> children = node.getChildren();
		ECollections.sort(children, new NodeComparator());
		
		return null;
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
		
		try {
			String[] positionStringArray= entryPoint.getAgentPositions().split(",");
			for (String posString: positionStringArray) {
				int[] pos= new int[2];
				pos[0] = Integer.parseInt(posString.split(":")[0]);
				pos[1] = Integer.parseInt(posString.split(":")[1]);
				agentPos.add(pos);
			}
			return agentPos;			
		} catch (Exception e) {
			return agentPos;
		}
		
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

class NodeComparator implements Comparator<Node> {

	@Override
	public int compare(Node a, Node b) {
		Integer x = a.getX();
		Integer y = b.getX();
		return Integer.compare(x, y);
	}
	
}
