package agentPlacer;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import behaviortree.BehaviorTree;
import behaviortree.EntryPoint;
import behaviortree.Node;
import sun.management.resources.agent;

public class AgentPlacer {

	private static AgentPlacer instance;
	
	private List<int[]> agentList; 
	private EntryPoint entryPoint; 
	
	public AgentPlacer(EntryPoint entryPoint) {
		this.agentList = stringToList(entryPoint.getAgentPositions());
		this.entryPoint = entryPoint;
	}
	
	public static String getAgentString()
	{
		return listToString(instance.agentList);
	}

	public static void run(EntryPoint entryPoint)
	{
		instance = new AgentPlacer(entryPoint);
		SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            instance.createAndShowGui();
	         }
	      });
	}
	
	public void printList(List<int[]> list)
	{
		for (int[] item : list) {
			System.out.print("[");
			System.out.print(item[0]);
			System.out.print(",");
			System.out.print(item[1]);
			System.out.print("]");
		}
	}
	
	public boolean add(int[] pos)
	{
		if (!myContains(agentList, pos)) {
			try {
				agentList.add(pos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}
	
	private boolean myContains(List<int[]> list, int[] item)
	{
		for (int[] i : list) {
			if (i[0] == item[0] && i[1] == item[1]) {
				return true;
			}
		}
		return false;
	}
	
	private int[] myRemove(List<int[]> list, int[] item)
	{
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)[0] == item[0] && list.get(i)[1] == item[1]) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	public boolean remove(int[] pos)
	{
		if (myContains(agentList, pos)) {
			try {
				int[] removed = myRemove(agentList, pos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}
	
	// Utility methods for converting between agent list and agent string	
	public static List<int[]> stringToList(String string)
	{
		List<int[]> list = new ArrayList<int[]>();
		try {
			String[] positionStringArray = string.split(",");
			for (String posString: positionStringArray) {
				int[] pos= new int[2];
				pos[0] = Integer.parseInt(posString.split(":")[0]);
				pos[1] = Integer.parseInt(posString.split(":")[1]);
				list.add(pos);
			}
			return list;	
		} catch (Exception e) {
			return list;
		}
		
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
	    ColorGrid mainPanel = new ColorGrid(behaviorTree.getGridHeight(), behaviorTree.getGridLength(), cellWidth, this);
	    
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
	    frame.addWindowListener(new WindowAdapter() {
	        @Override
	        public void windowClosing(WindowEvent e) {
//	        	printList(AgentPlacer.instance.agentList);
	        	try {
		        	 TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(instance.entryPoint);
		        	    domain.getCommandStack().execute(new RecordingCommand(domain) {

		        	        @Override
		        	        protected void doExecute() {
		        	            // Implement your write operations here,
		        	            // for example: set a new name
		    		        	String agentListString = listToString(AgentPlacer.instance.agentList);
		    		        	AgentPlacer.instance.entryPoint.setAgentPositions(agentListString); 	
		        	        }
		        	    });	
				} catch (Exception e2) {
					// TODO: handle exception
				}
	        }
	      });
	}
}
