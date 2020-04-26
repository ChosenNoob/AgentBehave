package agentPlacer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.emf.ecore.EObject;

import behaviortree.BehaviorTree;
import behaviortree.EntryPoint;
import behaviortree.Node;

public class AgentPlacer {
	private static AgentPlacer instance;
	private List<int[]> agentList; 
	private EntryPoint entryPoint; 
	
	protected AgentPlacer() {
		
	}
	public static AgentPlacer getInstance(EntryPoint entryPoint) {
		if (instance == null) {
			instance = new AgentPlacer();
			instance.setAgentList(entryPoint);
		}
		return instance;
	}
	
	public static void closeInstance()
	{
		instance = null;
	}
	// Public API	
	public void setAgentList(EntryPoint entryPoint)
	{
		this.agentList = stringToList(entryPoint.getAgentPositions());
		this.entryPoint = entryPoint;
	}
	public String getAgentString()
	{
		for (int[] is : agentList) {
			System.out.println(is);	
		}
		return listToString(agentList);
	}
	public void run()
	{
		SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            createAndShowGui();
	         }
	      });
	}
	
	// Utility methods for converting between agent list and agent string	
	public static List<int[]> stringToList(String string)
	{
		List<int[]> list = new ArrayList<int[]>();
		String[] positionStringArray = string.split(",");
		for (String posString: positionStringArray) {
			int[] pos= new int[2];
			pos[0] = Integer.parseInt(posString.split(":")[0]);
			pos[1] = Integer.parseInt(posString.split(":")[1]);
			list.add(pos);
		}
		return list;
	}
	
	public static String listToString(List<int[]> list)
	{
		String agentString = "";
		for (int i = 0; i < list.size() - 1; i++) {
			agentString += list.get(i)[0] + ":" + list.get(i)[1] + ",";
		}
		agentString += list.get(list.size() - 1)[0] + ":" + list.get(list.size() - 1)[1];
		return agentString;
	}
	
	private void createAndShowGui()
	{
		BehaviorTree behaviorTree = (BehaviorTree) this.entryPoint.eContainer();
	    int cellWidth = 20;
	    ColorGrid mainPanel = new ColorGrid(behaviorTree.getGridHeight(), behaviorTree.getGridLength(), cellWidth);
	    mainPanel.agentList = agentList;
	    int colorVal = 0xFFFFFF;
	    int colorDelta = 0x000040;
	    int agentCount = 0;
	    for (EObject node : behaviorTree.eContents()) {
			if (node.eClass().getName() == "EntryPoint") {
				EntryPoint currentEP = (EntryPoint) node;
				if (currentEP == entryPoint) {
					mainPanel.placeAgents(currentEP, Color.green);
				}
				else {
					agentCount++;
					mainPanel.placeAgents(currentEP, new Color(colorVal - agentCount * colorDelta));
				}
			}
		}
	    JFrame frame = new JFrame("");
	    
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.getContentPane().add(mainPanel);
	    frame.pack();
	    frame.setLocationByPlatform(true);
	    frame.setVisible(true);
	}
}
