 package behaviortree.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.Condition;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


import javax.sound.midi.Sequence;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import agentPlacer.AgentPlacer;
import behaviortree.EntryPoint;
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
    public static final String[] actionNodeChildTypes = {};
    public static final String[] conditionNodeChildTypes = {};
    public static final String[] decoratorNodeChildTypes = {"ActionNode", "ConditionNode", "SequenceNode", "FallbackNode"};
    public static final String[] fallbackNodeChildTypes = {"ActionNode", "ConditionNode", "SequenceNode", "FallbackNode", "TreeSkeleton"};
    public static final String[] sequenceNodeChildTypes = {"ActionNode", "ConditionNode", "SequenceNode", "FallbackNode", "TreeSkeleton"};
    public static final String[] treeSkeletonChildTypes = {"ActionNode", "ConditionNode", "SequenceNode", "FallbackNode", "TreeSkeleton"};
    
    public static Node containerBehaviorTree;	//it is the behaviorTree which is our main container
    
    public String debugger(EObject self)
    {	
    	// Called by validate diagram option in the right click menu
    	// This prints to the Problems View (into the Info section)
    	// Set returnVal to whatever you want to print
    	Object returnVal = null;
    	return "Debugger: "; //+ returnVal.toString();
    }

    public void placeAgents(EObject obj)
    {
    	AgentPlacer agentPlacer = new AgentPlacer((EntryPoint) obj);
    	agentPlacer.run();
    }
    
    // Example of connecting a child
    // Does NOT check the type of child    
    public void setChild(Node parent, Node child)
    {
    	parent.getChildren().add(child);
    }
    
    // Example of creating a node
    // By calling this in context change menu and returning the new node,
    // i can set its features in the design diagram after it is created
    public Node createNode(Node container, EClass className)
    {
    	Node newNode = (Node) behaviortree.BehaviortreeFactory.eINSTANCE.create(className);
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
    
    // Tree skeleton hiding feature
	public List<EObject> isHidden(EObject self)
    {
	    //print(self);
	    //print(classType);
	    List<EObject> resultList = new ArrayList<>();
	    List<EObject> children = self.eContents();
	    
	    for (EObject child : children) {
			if (child.eClass().getName() == "TreeSkeleton") {
				TreeSkeleton castChild = (TreeSkeleton) child;
				if (castChild.isIsHidden()) {
					resultList.add(child);
					continue;
				}
			}
			resultList.add(child);
			resultList.addAll(isHidden(child));
		}
	    System.out.println(resultList);
	    return resultList;
//	    List<EObject> resultList = new ArrayList<>();
//	    TreeIterator<EObject> iterator = self.eAllContents();
//	    print(self);
//	    while(iterator.hasNext()) {
//	        EObject obj = iterator.next();
//	        if(obj.eClass().getName() == "TreeSkeleton") {
//            	resultList.add(obj);
//		        TreeSkeleton ref = (TreeSkeleton) obj;
//		        TreeIterator<EObject> iteratorSkeleton = obj.eAllContents();
//		        if(!ref.isIsHidden())
//		        {
//		            while(iteratorSkeleton.hasNext())
//		            {
//		            	EObject obj2 = iteratorSkeleton.next();
//		            	obj = iterator.next();
//		            	if(obj2.eClass().getName() == "TreeSkeleton")
//		            	{
//		            		List<EObject> childSkeleton = isHidden(obj2);
//		            		for (int i = 0; i < childSkeleton.size(); i++) 
//		            			resultList.add(childSkeleton.get(i));
//		            		/*for (int i = 0; i < obj2.eAllContents() i++) Burada iterator'un childSkeletondaki bütün nodlar kadar ilerletilmesi gerekiyor....
//		            			iterator.next();*/
//
//		            	}
//		            	else
//		            		resultList.add(obj2);
//		            }
//		        }
//		        else
//		        {
//		            while(iteratorSkeleton.hasNext())
//		            {
//		            	iteratorSkeleton.next();
//		            	obj = iterator.next();
//		            }
//		        }
//	        }
//	        else
//	        	resultList.add(obj);
//	    }
//	    return resultList;
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
    
    public boolean canBeChild(Node parent, Node child)
    {
    	if (parent == child) {
			return false;
		}
    	String parentClassName = parent.eClass().getName();
    	String childClassName = child.eClass().getName();
    	if (parentClassName == "EntryPoint" || 
    			parentClassName == "TreeSkeleton" || 
    			parentClassName == "BehaviorTree") {
			return true;
		}
    	if(parentClassName == "DecoratorNode" && parent.eContents().size() > 0)
    		return false;
    	
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
    	childRelations.put("SequenceNode",  Arrays.asList(Services.sequenceNodeChildTypes));
    	childRelations.put("TreeSkeleton",  Arrays.asList(Services.treeSkeletonChildTypes));
    	return childRelations;
    }
    
    public List<EObject> treeSkeletonChildrenList(EObject self, EObject element)
    {   
        List<EObject> resultList = new ArrayList<>();
        print(self);
        //print(element);
        TreeIterator<EObject> iterator = element.eAllContents();
        while(iterator.hasNext()) {
            EObject obj = iterator.next();
            if(obj.eContainer().eClass().getName() == "TreeSkeleton") {
                //print(obj.eClass().getName());
                resultList.add(obj);
                obj.eAllContents().forEachRemaining(a -> {resultList.add(a);});
            }
        }
        return resultList;
    }
    
    
    public static void print(Object obj)
    {
    	System.out.println(obj);
    }
    
    
    // IMPORT AND EXPORT IMPLEMENTATION STARTS HERE *********************************************************************************
    public void showImportExportModal(Node container) {
    	if (container.getClass().getName().equals("behaviortree.impl.BehaviorTreeImpl")) {
    		containerBehaviorTree = container;																	//This line is to set container behavior tree after a node creation
    		openFileChooser();																	// opens file chooser to import and export
    	}
    }
    public static void openFileChooser() {
    	print("\ncreateAndShowGUI will be called.");
	    SwingUtilities.invokeLater(new Runnable() {
			  public void run() {
			      //Turn off metal's use of bold fonts
			      UIManager.put("swing.boldMetal", Boolean.FALSE); 
			      FileChooser.createAndShowGUI();
			  }
	    });
    	print("createAndShowGUI is called.\n");
    }
    
    public static void readFileAndCallParser(File file) {
    	 try  
         {   
             FileReader fr=new FileReader(file);   //reads the file  
             BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
             StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
             String line;  
             while((line=br.readLine())!=null)  
             {  
	                sb.append(line);      //appends line to string buffer  
	                sb.append("\n");     //line feed   
             }  
             fr.close();    //closes the stream and release the resources  
             //System.out.println("Contents of File: ");  
             //System.out.println(sb.toString());   //returns a string that textually represents the object  
         }  
         catch(IOException ex)  
         {  
             ex.printStackTrace();  
         }
         
         Services.xmlParser(file);	//call XML parser
    }
   
    public static void xmlParser(File fXmlFile) {

        try {
	    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    	Document doc = dBuilder.parse(fXmlFile);
	
	    	//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());		
	    	
	    	NodeList nList = doc.getElementsByTagName("children");
	    	createTreeFromXML(nList);								
	    			
        } catch (Exception e) {
        	e.printStackTrace();
        }
      }
    public static void createTreeFromXML(org.w3c.dom.NodeList nList) {
    	//System.out.println(nList.getLength());
    	//print(containerBehaviorTree);
    	if ( containerBehaviorTree == null ) {
    		print("containerBehaviorTree is NULL!!!!!!!!!!!!!!!!!!!");
    		return;
    	}
    	Node entryPoint = null;
    	
    	for (int i = 0; i < nList.getLength(); i++) {
    		org.w3c.dom.Node node = nList.item(i);
    		
    		if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
    			Element parentElement = (Element)node;														//Parent Node
    			Node parentNode = createOneNode(parentElement);			//TRAVERSE ALL ATTRIBUTES!!!
    			
    			if(parentElement.getAttribute("xsi:type").equals("behaviortree:EntryPoint")) {		//add entry point to the behavior tree
    				entryPoint = parentNode;
    				recursiveTreeCreator(parentNode, parentElement);//this method creates remaining nodes recursively and preserves parent-child relationship
    			}
    			
    		}
    	}
    	
    	
    	containerBehaviorTree.getChildren().add(entryPoint);
    }
    public static void recursiveTreeCreator(Node parentNode, Element parentElement) {
    	NodeList childrenNodes = parentElement.getChildNodes();
    	for (int j=0; j<childrenNodes.getLength(); j++) {
			if (childrenNodes.item(j).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
				Element tempElement = (Element)childrenNodes.item(j); 							//Child Node	
				//print(parentElement.getAttribute("name") +"  "+tempElement.getAttribute("name") +" j:"+j + parentElement.getChildNodes().getLength());
				Node childNode = createOneNode(tempElement);
				recursiveTreeCreator(childNode, tempElement);
				parentNode.getChildren().add(childNode);
			}
		}
    }
    
    public static Node createOneNode(Element element) {
    	Node node = null;
    	String nodeType = element.getAttribute("xsi:type");
    	String nodeName = element.getAttribute("name");
    	String x = element.getAttribute("x");
    	String y = element.getAttribute("y");
    	switch(nodeType) {
    	case "behaviortree:EntryPoint":
    		node = (Node) behaviortree.BehaviortreeFactory.eINSTANCE.create(BehaviortreePackage.Literals.ENTRY_POINT);
    		((EntryPoint)node).setAgentName(element.getAttribute("agentName"));
    		((EntryPoint)node).setAgentPositions(element.getAttribute("agentPositions"));
    		((EntryPoint)node).setAgentCount(Integer.parseInt(element.getAttribute("agentCount")));
    		//((EntryPoint)node).setRandomPlacement(Boolean.parseBoolean(element.getAttribute("randomPlacement")));			getRandomPlacement() methodu yok (export ederken gerekli)!!!!!!!!!!!1
    		break;
    	case "behaviortree:SequenceNode":
    		node = (Node) behaviortree.BehaviortreeFactory.eINSTANCE.create(BehaviortreePackage.Literals.SEQUENCE_NODE);
    		break;
	    case "behaviortree:FallbackNode":
	    	node = (Node) behaviortree.BehaviortreeFactory.eINSTANCE.create(BehaviortreePackage.Literals.FALLBACK_NODE);
	    	break;
	    case "behaviortree:TreeSkeleton":
			node = (Node) behaviortree.BehaviortreeFactory.eINSTANCE.create(BehaviortreePackage.Literals.TREE_SKELETON);
			break;
		case "behaviortree:ActionNode":
			node = (Node) behaviortree.BehaviortreeFactory.eINSTANCE.create(BehaviortreePackage.Literals.ACTION_NODE);
			((ActionNode)node).setActionName(element.getAttribute("actionName"));;
			break;
		case "behaviortree:ConditionNode":
			node = (Node) behaviortree.BehaviortreeFactory.eINSTANCE.create(BehaviortreePackage.Literals.CONDITION_NODE);
			((ConditionNode)node).setConditionName(element.getAttribute("conditionName"));;
			break;
    	}
    	if(node != null) {
    		node.setName(nodeName);
    		node.setX(Integer.parseInt(x));
    		node.setY(Integer.parseInt(y));
    	}
    	return node;
    }
    
    public static void exportToFile(File file) {
        String path = file.getAbsolutePath();

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                  new FileOutputStream(path), "utf-8"))) {
        	
            writer.write(transformTreeToXML());		//This line writes content to selected file
        }
        catch (Exception e) {
        	print("Exception occured while exporting.");
			e.printStackTrace();
		}
        System.out.println("Save as file: " + path);
    }
    
    public static String transformTreeToXML() {
    	if ( containerBehaviorTree == null ) {
    		print("containerBehaviorTree is NULL!!!!!!!!!!!!!!!!!!!");
    		return "";
    	}
    	
    	StringBuilder XMLContent = new StringBuilder();
    	XMLContent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
    			"<behaviortree:BehaviorTree xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" "+
    			"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:behaviortree=\"http://www.example.org/behaviortree\">\n");
   	
        TreeIterator<EObject> iterator = containerBehaviorTree.eAllContents();
        while(iterator.hasNext()) {
            EObject obj = iterator.next();
            
            //Export all the trees starting with an EntryPoint and have at least one child.
            if ( ((Node)obj).getClass().getName().equals("behaviortree.impl.EntryPointImpl") && ((Node)obj).getChildren().size() > 0 ){
            	XMLContent.append(recursiveChildrenXMLCreator((Node)obj,"  "));
            }
        }
    	
    	XMLContent.append("</behaviortree:BehaviorTree>");
    	return XMLContent.toString();
    }
    
    public static String recursiveChildrenXMLCreator(Node node,String indendationString) {		
    	StringBuilder XMLContent = new StringBuilder();
    	if (node.getChildren().size() == 0) {
    		XMLContent.append(indendationString);
    		XMLContent.append(transformOneNodeToChildrenTag(node));
    		XMLContent.append("\"/>\n");
    		return XMLContent.toString();
    	}
    	else {
    		XMLContent.append(indendationString);
    		XMLContent.append(transformOneNodeToChildrenTag(node));
    		XMLContent.append("\">\n");
    		List<Node> childrenNodes = node.getChildren();
    		for(int i=0; i<childrenNodes.size(); i++) {
    			XMLContent.append(recursiveChildrenXMLCreator(childrenNodes.get(i), indendationString+"  "));
    		}
    		XMLContent.append(indendationString);
    		XMLContent.append("</children>\n");
    		return XMLContent.toString();
    	}
    }
    
    /**
     * This method leaves <children> tag opened. Do not forget to close manually.
     */
    public static String transformOneNodeToChildrenTag(Node node) {		//TRAVERSE ALL THE ATTRIBUTES !!!
    	StringBuilder XMLContent = new StringBuilder();
    	XMLContent.append("<children xsi:type=\"");
		XMLContent.append(transformClassNames(node.getClass().getName()));
		XMLContent.append("\" name=\"");
		XMLContent.append(node.getName());
		XMLContent.append(transformAttributesToXML(node));
		XMLContent.append("\" x=\"");
		XMLContent.append(node.getX());
		XMLContent.append("\" y=\"");
		XMLContent.append(node.getY());
		return XMLContent.toString();
    }
    
    public static String transformAttributesToXML(Node node) {
    	String className = node.getClass().getName();
    	StringBuilder XMLContent = new StringBuilder("");
    	switch (className){
    		case "behaviortree.impl.EntryPointImpl":
    			XMLContent.append("\" agentName=\"");
    			XMLContent.append(((EntryPoint)node).getAgentName());
    			XMLContent.append("\" agentPositions=\"");
    			XMLContent.append(((EntryPoint)node).getAgentPositions());
    			XMLContent.append("\" agentCount=\"");
    			XMLContent.append(((EntryPoint)node).getAgentCount());
    			//XMLContent.append("\" randomPlacement=\"");
    			//XMLContent.append(((EntryPoint)node).getRandomPlacement());					//getRandomPlacement() methodu yok !!!!!!!!!!!!!!!!!!!!!!!!!!!! setRandomPlacement() var ama
    			break;
    		case "behaviortree.impl.ActionNodeImpl":
    			XMLContent.append("\" actionName=\"");
    			XMLContent.append(((ActionNode)node).getActionName());
    			break;
    		case "behaviortree.impl.ConditionNodeImpl":
    			XMLContent.append("\" conditionName=\"");
    			XMLContent.append(((ConditionNode)node).getConditionName());
    			break;
    	}
    		
    	return XMLContent.toString();
    }
    
    
    public static String transformClassNames(String className) {
    	String transformedName = null;
    	switch(className) {
    	case "behaviortree.impl.EntryPointImpl":
    		transformedName = "behaviortree:EntryPoint";
    		break;
    	case "behaviortree.impl.SequenceNodeImpl":
    		transformedName = "behaviortree:SequenceNode";
    		break;
	    case "behaviortree.impl.FallbackNodeImpl":
	    	transformedName = "behaviortree:FallbackNode";
	    	break;
	    case "behaviortree.impl.TreeSkeletonImpl":
	    	transformedName = "behaviortree:TreeSkeleton";
			break;
		case "behaviortree.impl.ActionNodeImpl":
			transformedName = "behaviortree:ActionNode";
			break;
		case "behaviortree.impl.ConditionNodeImpl":
			transformedName = "behaviortree:ConditionNode";
			break;
    	}
    	return transformedName;
    }
    // IMPORT AND EXPORT IMPLEMENTATION ENDS HERE *********************************************************************************

}
