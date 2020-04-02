package behaviortree.design;

import java.util.List;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.concurrent.locks.Condition;
//
//import javax.sound.midi.Sequence;
//import javax.swing.JFileChooser;
//import javax.swing.SwingUtilities;
//import javax.swing.UIManager;
//
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EObject;


import behaviortree.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
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
    	return "Debugger: " + returnVal.toString();
    }
    
    // TODO    
//    public void addChild(SequenceNode parent, SequenceNodeChild child)
//    {
//    	parent.setChildren(child);
//    }
    public EObject deleteNode(ActionNode self) {
    	System.out.print(self.eClass().getName());
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
    
    public boolean isLeafNode(EObject node) {
    	if(node.eClass().getName() == "ActionNode" || node.eClass().getName() == "ConditionNode") {
    		return true;
    	}
    	return false;
    }
    
    public boolean isLeaf(EObject node)
    {
    	if (node.eContents().isEmpty() == true)
			return true;
		return false;
    }
}
