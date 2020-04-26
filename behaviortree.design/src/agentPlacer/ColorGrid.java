package agentPlacer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import behaviortree.EntryPoint;

@SuppressWarnings("serial")
public class ColorGrid extends JPanel {
   private JLabel[][] myLabels;
   private int length;
   private int height;
   public List<int[]> agentList;
   public ColorGrid(int rows, int cols, int cellWidth) {
	   length = cols;
	   height = rows;
      myLabels = new JLabel[rows][cols];

      MyMouseListener myListener = new MyMouseListener(this);
      Dimension labelPrefSize = new Dimension(cellWidth, cellWidth);
      setLayout(new GridLayout(rows, cols));
      for (int row = 0; row < myLabels.length; row++) {
         for (int col = 0; col < myLabels[row].length; col++) {
            JLabel myLabel = new JLabel();
            myLabel.setOpaque(true);
            myLabel.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF)));
            myLabel.setBackground(Color.black);
            myLabel.addMouseListener(myListener);
            myLabel.setPreferredSize(labelPrefSize);
            add(myLabel);
            myLabels[row][col] = myLabel;
         }
      }
   }
   
   public void placeAgents(EntryPoint entryPoint, Color color)
   {
	   List<int[]> agentList = AgentPlacer.stringToList(entryPoint.getAgentPositions());
	   for (int[] pos : agentList) {
		   myLabels[pos[0]][pos[1]].setBackground(color);
	   }
   }
   
   public void labelPressed(JLabel label) {
	   for (int i = 0; i < height; i++) {
		   for (int j = 0; j < length; j++) {
			if (label == myLabels[i][j]) {
				   if (label.getBackground() == Color.black) {
					   label.setBackground(Color.green);
					   int[] pos = {i, j};
					   if (!agentList.contains(pos)) {
						   agentList.add(pos);
					   }
				   }
				   else if (label.getBackground() == Color.green) {
					   label.setBackground(Color.black);
					   int[] pos = {i, j};
					   if (agentList.contains(pos)) {
						   agentList.remove(pos);
					   }
					   
				   }				
			}
		}
	   }

   }
}