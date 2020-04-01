 package behaviortree.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.Condition;

import javax.sound.midi.Sequence;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import behaviortree.ActionNode;
import behaviortree.ActionNodeChild;
import behaviortree.ConditionNode;
import behaviortree.FallbackNode;
import behaviortree.Node;
import behaviortree.SequenceNode;
import behaviortree.TreeSkeleton;
import behaviortree.impl.ActionNodeImpl;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	// Each of your custom services require the first parameter to be EObject self

    public void printClassName(EObject self) {
    	// This prints to the original eclipse instance's terminal
		System.out.println(self.eClass());
	}
    
    public String debugger(EObject self)
    {	
    	// Called by validate diagram option in the right click menu
    	// This prints to the Problems View (into the Info section)
    	// Set returnVal to whatever you want to print
    	Object returnVal = checkLeafNodes(self);
    	SwingUtilities.invokeLater(new Runnable() {
      public void run() {
          //Turn off metal's use of bold fonts
          UIManager.put("swing.boldMetal", Boolean.FALSE); 
          FileChooser.createAndShowGUI();
      }
  });
    	return "Debugger: " + returnVal.toString();
    }
    
    public void debugger(EObject self, EObject print)
    {	
    	// Called by validate diagram option in the right click menu
    	// This prints to the Problems View (into the Info section)
    	// Set returnVal to whatever you want to print
    	System.out.println(print);
    }
    
    // TODO    
    public void addChild(ActionNode parent, ActionNodeChild child)
    {
    }
    public void setChild(ActionNode parent, ActionNodeChild child)
    {
    	printClassName(child);
    	parent.setChildren(child);
    }
    public EObject deleteNode(ActionNode self) {
    	System.out.println(self.eContainer());
//    	if (self.eContainer().eClass().getName() == "") {
//			
//		}
//    	String name = "ActionNode";
//    	for (int i = 0; i < self.eContents().size(); i++) {
//        	setChild( ) self.eContainer(), (ActionNodeChild) self.eContents().get(i));	
//		}
    	return null;
	}
    public EObject deleteNode(ConditionNode self) {
    	System.out.print(self.eClass().getName());
    	return null;
	}
    public EObject deleteNode(SequenceNode self) {
    	System.out.print(self.eClass().getName());
    	return null;
	}
    public EObject deleteNode(FallbackNode self) {
    	System.out.print(self.eClass().getName());
    	return null;
	}
    public EObject deleteNode(TreeSkeleton self) {
    	System.out.print(self.eClass().getName());
    	return null;
	}
    
    // Validation functions    
    // Called by validate diagram option in the right click menu
    public boolean checkLeafNodes(EObject node)
    {
    	if(isLeaf(node))
    		return isActionNode(node);
    	else
    		return checkLeafNodes(node.eContents()); 
    }
    public boolean checkLeafNodes(List<EObject> nodeList)
    {
    	if (nodeList.size() == 1) 
			return checkLeafNodes(nodeList.get(0));
    	else
			return checkLeafNodes(nodeList.subList(0, 1)) 
					&&
					checkLeafNodes(nodeList.subList(1, nodeList.size()));
    }
    
    // General helper functions    
    public boolean isActionNode(EObject node)
    {
    	if (node.eClass().getName() == "ActionNode")
			return true;
		return false;
    }
    public boolean isLeaf(EObject node)
    {
    	if (node.eContents().isEmpty() == true)
			return true;
		return false;
    }
}