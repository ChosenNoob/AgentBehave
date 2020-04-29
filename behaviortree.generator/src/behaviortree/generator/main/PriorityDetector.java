package behaviortree.generator.main;

import java.io.File;
import java.nio.file.Paths;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.acceleo.common.utils.CircularArrayDeque;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import behaviortree.BehaviorTree;

public class PriorityDetector {
	public static void setNodeCoors(BehaviorTree behaviorTree)
	{
		try {
			File reprFile= Paths.get(behaviorTree.getProjectPath(), "representations.aird").toFile();
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse(reprFile);

			TreeIterator<EObject> allContents = behaviorTree.eAllContents() ;
			while (allContents.hasNext()) {
				behaviortree.Node currentContent = (behaviortree.Node ) allContents.next();
				String uid = findUidWithAgentName(document, currentContent.getName());
				Node childrenNode = findChildrenWithUID(document, uid);
				Node layoutNode = findLayoutWithChildren(document, childrenNode);
				currentContent.setX(Integer.parseInt(getAttrVal(layoutNode, "x")));
				currentContent.setY(Integer.parseInt(getAttrVal(layoutNode, "y")));
//				System.out.println(currentContent.getName());
//				System.out.println(getAttrVal(layoutNode, "x"));
//				System.out.println(getAttrVal(layoutNode, "y"));
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static Node findLayoutWithChildren(Document document, Node childrenNode)
	{
		NodeList nodeList = document.getDocumentElement().getElementsByTagName("layoutConstraint");
		int nodeCount = nodeList.getLength(); 
		for (int i = 0; i < nodeCount; i++) {
			Node currentNode = nodeList.item(i);
			if (currentNode.getParentNode().equals(childrenNode)) {
				return currentNode;
			}
		}
		return null;
	}
	
	private static String findUidWithAgentName(Document document, String agentName)
	{
		NodeList nodeList = document.getDocumentElement().getElementsByTagName("ownedDiagramElements");
		int nodeCount = nodeList.getLength(); 
		for (int i = 0; i < nodeCount; i++) {
			Node currentNode = nodeList.item(i);
			if (checkAttrVal(currentNode, "name", agentName)) {
				return getAttrVal(currentNode, "uid");
			}
		}
		return null;
	}
	
	private static Node findChildrenWithUID(Document document, String uid)
	{
		NodeList nodeList = document.getDocumentElement().getElementsByTagName("children");
		int nodeCount = nodeList.getLength(); 
		for (int i = 0; i < nodeCount; i++) {
			Node currentNode = nodeList.item(i);
			if (checkAttrVal(currentNode, "element", uid)) {
				return currentNode;
			}
		}
		return null;
	}
	
	private static String getAttrVal(Node node, String attr)
	{
		if (node.hasAttributes()) {
			NamedNodeMap attrs = node.getAttributes();
			int attrCount = attrs.getLength();
			for (int i = 0; i < attrCount; i++) {
				Node currentAttr = attrs.item(i);
				if (currentAttr.getNodeName().equals(attr)) {
					return currentAttr.getNodeValue();
				}
			}
		}
		return null;
	}
	
	// Checks if the given node has an attribute named "attr" with the value "val" 	
	private static boolean checkAttrVal(Node parent, String attr, String val)
	{
		if (parent.hasAttributes()) {
			NamedNodeMap attributes = parent.getAttributes();
			int atttributeCount = attributes.getLength();
			for (int i = 0; i < atttributeCount; i++) {
				Node currentAttr = attributes.item(i);
				if (currentAttr.getNodeName().equals(attr) && 
						currentAttr.getNodeValue().equals(val)) {
					return true;
				}
			}
		}
		return false;
	}
}
