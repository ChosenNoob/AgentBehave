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

import behaviortree.ActionNode;
import behaviortree.BehaviorTree;
import behaviortree.BehaviortreePackage;
import behaviortree.ConditionNode;
import behaviortree.EntryPoint;
import behaviortree.FallbackNode;
import behaviortree.Node;
import behaviortree.SequenceNode;
import behaviortree.impl.BehaviortreeFactoryImpl;
import behaviortree.impl.BehaviortreePackageImpl;

public class Services {
	
	public String generateGridCode(BehaviorTree behaviorTree) {
		
		PriorityDetector.setNodeCoors(behaviorTree);
				
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
		
		// Singleton Grid Instance		
		gridCode += "	public static Grid instance = null;" + "\n";
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
		gridCode += "		instance = grid;" + "\n";
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
			gridCode += "" + "\n";
			
			// Agent Placement
			gridCode += "		for (int[] pos : " + agentVarName + "AgentPos) {" + "\n";
			gridCode += "			" + agentClassName + " agent = new " + agentClassName + "();" + "\n";
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
		
//		// Properties		
//		gridCode += "	public Grid<Object> grid;" + "\n";
//		gridCode += "	public int x;" + "\n";
//		gridCode += "	public int y;" + "\n";
//		gridCode += "" + "\n";
//		
//		// Constructor
//		gridCode += "	public Agent(Grid<Object> grid) {" + "\n";
//		gridCode += "		this.grid = grid;" + "\n";
//		gridCode += "	}" + "\n";
		
		// Class Body Close
		gridCode += "}" + "\n";
		
		return gridCode;
	}
	
	public String generateAgentCode(EntryPoint entryPoint)
	{
		String agentCode = "";

		String projectName = getProjectName((BehaviorTree) entryPoint.eContainer());
		String agentClassName = getClassName(entryPoint); 
		String agentBaseClassName = getBaseClassName(entryPoint);
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
		agentCode += "public class " + agentClassName + " extends " + agentBaseClassName +  " {" + "\n";
		agentCode += "\n";
		
//		// Constructor
//		agentCode += "	public " + agentClassName + "(Grid<Object> grid) {" + "\n";
//		agentCode += "		super(grid);" + "\n";
//		agentCode += "	}" + "\n";
//		agentCode += "" + "\n";
		
		// Scheduled Methods		
		agentCode += "	@ScheduledMethod(start = 1, interval = 1, priority = 1)" + "\n";
		
		agentCode += genNodeCode(entryPoint);
		
		
		// Class Body Close
		agentCode += "}" + "\n";
		
		return agentCode;
	}
	
	public String genFallbackCode(FallbackNode node)
	{
		// EList sorting is done by comparing x values of nodes
		// So first item in the list has the smallest x value
		// NodeComparator is at the end of this file
		EList<Node> children = node.getChildren();
		ECollections.sort(children, new NodeComparator());
		
		String code = "";

		code += "	public TickReturn " + getMethodName(node) + "() {" + "\n";
		code += "		TickReturn tickResult;" + "\n";
		code += "" + "\n";
		for (Node child : children) {			
			switch (child.eClass().getName()) {
			case "ActionNode":
				ActionNode actionChild = (ActionNode) child;
				code += genFallbackBlock(actionChild.getActionName());
				break;

			case "ConditionNode":
				ConditionNode conditionChild = (ConditionNode) child;
				code += genFallbackBlock(conditionChild.getConditionName());
				break;

			case "SequenceNode":
				code += genFallbackBlock(getMethodName(child));
				break;

			case "FallbackNode":
				code += genFallbackBlock(getMethodName(child));
				break;
			}
			code += "" + "\n";
		}
		
		code += "		return TickReturn.FAILURE;" + "\n";
		code += "	}" + "\n";
		code += "" + "\n";
		return code + genNodeCode(node);
	}
	
	public String genSequenceCode(SequenceNode node)
	{
		// EList sorting is done by comparing x values of nodes
		// So first item in the list has the smallest x value
		// NodeComparator is at the end of this file
		EList<Node> children = node.getChildren();
		ECollections.sort(children, new NodeComparator());
		
		String code = "";

		code += "	public TickReturn " + getMethodName(node) + "() {" + "\n";
		code += "		TickReturn tickResult;" + "\n";
		code += "" + "\n";
		for (Node child : children) {			
			switch (child.eClass().getName()) {
			case "ActionNode":
				ActionNode actionChild = (ActionNode) child;
				code += genSequenceBlock(actionChild.getActionName());
				break;

			case "ConditionNode":
				ConditionNode conditionChild = (ConditionNode) child;
				code += genSequenceBlock(conditionChild.getConditionName());
				break;

			case "SequenceNode":
				code += genSequenceBlock(getMethodName(child));
				break;

			case "FallbackNode":
				code += genSequenceBlock(getMethodName(child));
				break;
			}
			code += "" + "\n";
		}
		
		code += "		return TickReturn.SUCCESS;" + "\n";
		code += "	}" + "\n";
		code += "" + "\n";
		return code + genNodeCode(node);
	}
	
	public String genSequenceBlock(String methodName) {
		String code = "";
		code += "		tickResult = " + methodName + "();" + "\n";
		code += "		if(tickResult != TickReturn.SUCCESS) {" + "\n";
		code += "			return tickResult;" + "\n";
		code += "		}" + "\n";
		return code;
	}
	
	public String genFallbackBlock(String methodName) {
		String code = "";
		code += "		tickResult = " + methodName + "();" + "\n";
		code += "		if(tickResult != TickReturn.FAILURE) {" + "\n";
		code += "			return tickResult;" + "\n";
		code += "		}" + "\n";
		return code;
	}
	
	public String genNodeCode(Node node)
	{
		// EList sorting is done by comparing x values of nodes
		// So first item in the list has the smallest x value
		// NodeComparator is at the end of this file
		EList<Node> children = node.getChildren();
		ECollections.sort(children, new NodeComparator());
		
		String code = "";
		for (Node child : children) {
			switch (child.eClass().getName()) {
			case "SequenceNode":
				code += genSequenceCode((SequenceNode) child);
				break;
			case "FallbackNode":
				code += genFallbackCode((FallbackNode) child);
				break;
			default:
				break;
			}
		}

		return code;
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
	
	public String getBaseClassName(EntryPoint entryPoint)
	{
		return entryPoint.getAgentName() + "Base";
	}
	
	public String getProjectName(BehaviorTree behaviorTree){
		Path projectPath = Paths.get(behaviorTree.getProjectPath());
		return projectPath.getFileName().toString();
	}
	
	public String getMethodName(Node node)
	{
		return node.getName().replaceAll("\\s+", "");
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
}

class NodeComparator implements Comparator<Node> {

	@Override
	public int compare(Node a, Node b) {
		Integer x = a.getX();
		Integer y = b.getX();
		return Integer.compare(x, y);
	}
	
}
