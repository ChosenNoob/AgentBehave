 package behaviortree.design;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.Map;

import javax.sound.midi.Sequence;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


import behaviortree.ActionNode;
import behaviortree.BehaviorTree;
import behaviortree.BehaviortreePackage;
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

	// These represents each node types' possible children types
    public static final String[] actionNodeChildTypes = {"ConditionNode"};
    public static final String[] conditionNodeChildTypes = {"ActionNode", "ConditionNode"};
    public static final String[] decoratorNodeChildTypes = {"ActionNode", "ConditionNode"};
    public static final String[] fallbackNodeChildTypes = {"ActionNode", "ConditionNode"};
    
    public String debugger(EObject self)
    {	
    	// Called by validate diagram option in the right click menu
    	// This prints to the Problems View (into the Info section)
    	// Set returnVal to whatever you want to print
    	Object returnVal = null;
    	return "Debugger: " + returnVal.toString();
    }
    
    // Example of connecting a child
    // Does NOT checks the type of child    
    public void setChild(Node parent, Node child)
    {
    	parent.getChildren().add(child);
    }
    
    // Example of creating a node
    // By calling this in context change menu and returning the new node,
    // i can set its features in the design diagram after it is created
    public ActionNode createActionNode(Node container)
    {
    	ActionNode newNode = behaviortree.BehaviortreeFactory.eINSTANCE.createActionNode();
    	setChild(container, newNode);
    	return newNode;
    }
    
    // Example of deleting a node
    public void deleteNode(Node node)
    {
    	Node bt = getBehaviorTree(node);
    	Node parent = (Node) node.eContainer();
    	parent.getChildren().remove(node);
    	
    	for (Node child : node.getChildren()) {
    		if (canBeChild(parent, child))
    			setChild(parent, child);
    		else
    			setChild(bt, child);
		}
    }
    
    // Validation functions    
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
    

    // Get the Behavior Tree object in the model hierarchy.
    // It looks like there is no easy way to access it other than traversing the model hierarchy
    // So this requires a node to traverse the hierarchy. It can be any node in the model   
    public BehaviorTree getBehaviorTree(Node node)
    {
    	EObject root = node;
    	while (root.eContainer() != null) {
    		root = root.eContainer();
		}
    	return (BehaviorTree) root;
    }
    
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
    
    public static boolean canBeChild(Node parent, Node child)
    {
    	String parentClassName = parent.eClass().getName();
    	String childClassName = child.eClass().getName();
    	if (parentClassName == "EntryPoint" || 
    			parentClassName == "TreeSkeleton" || 
    			parentClassName == "BehaviorTree") {
			return true;
		}
    	return childRelations.get(parentClassName).contains(childClassName);
    }
    
    
    // Holds what type of Nodes can have what type of children Nodes
    public static final Map<String, List<String>> childRelations = createChildRelations();
    
    // Initializes childRelations    
    public static Map<String, List<String>> createChildRelations()
    {
    	Map<String, List<String>> childRelations = new HashMap<String, List<String>>();
    	childRelations.put("ActionNode",  Arrays.asList(Services.actionNodeChildTypes));
    	childRelations.put("ConditionNode",  Arrays.asList(Services.conditionNodeChildTypes));
    	childRelations.put("DecoratorNode",  Arrays.asList(Services.decoratorNodeChildTypes));
    	childRelations.put("FallbackNode",  Arrays.asList(Services.fallbackNodeChildTypes));
    	return childRelations;
    }
    
    public void print(Object obj)
    {
    	System.out.println(obj);
    }
}
