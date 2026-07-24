package mcframe.serverPFUD.PFUDL5040;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import static mcframe.serverCore.requester.MCRequestObject.*;


public class PFUDL_ODataMetaDataParser_MC {

	protected static final Class<PFUDL_ODataMetaDataParser> CLAZZ = PFUDL_ODataMetaDataParser.class;

	protected String getEntityTypeFullName(Document doc, String entitySetName, String namespaceURI) throws Exception {
		XPath xpath = XPathFactory.newInstance().newXPath();

		String expression;
		if (namespaceURI == null || namespaceURI.isEmpty()) {
			// 名前空間なし：local-name() で検索
			expression = String.format("//*[local-name()='EntitySet' and @Name='%s']/@EntityType", entitySetName);
		}
		else {
			// 名前空間あり：namespace-uri() でフィルタ
			expression = String.format("//*[(local-name()='EntitySet' and namespace-uri()='%s' and @Name='%s')]/@EntityType", namespaceURI,
					entitySetName);
		}

		return xpath.evaluate(expression, doc);
	}

	protected String extractLocalTypeName(String entityTypeFullName) {
		if (entityTypeFullName == null) return null;
		return entityTypeFullName.contains(".") ? entityTypeFullName.substring(entityTypeFullName.lastIndexOf('.') + 1)
				: entityTypeFullName;
	}

	protected Map<String, String> getAllPropertyTypes(Document doc, String entityTypeFullName, String namespaceURI) throws Exception {

		Map<String, String> result = new HashMap<>();
		if (entityTypeFullName == null || entityTypeFullName.isEmpty()) return result;

		XPath xpath = XPathFactory.newInstance().newXPath();
		String entityTypeName = extractLocalTypeName(entityTypeFullName);

		String expression;

		if (namespaceURI == null || namespaceURI.isEmpty()) {
			expression = String.format("//*[local-name()='EntityType' and @Name='%s']", entityTypeName);
		}
		else {
			expression = String.format("//*[(local-name()='EntityType' and namespace-uri()='%s' and @Name='%s')]", namespaceURI,
					entityTypeName);
		}

		Node entityTypeNode = (Node) xpath.evaluate(expression, doc, XPathConstants.NODE);
		if (entityTypeNode == null) return result;

		NodeList children = entityTypeNode.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
			if (child.getNodeType() == Node.ELEMENT_NODE && "Property".equals(child.getLocalName())) {
				Element prop = (Element) child;
				String name = prop.getAttribute("Name");
				String type = prop.getAttribute("Type");
				if (type != null && type.startsWith("Edm.")) {
					result.put(name, type);
				}
			}
		}

		return result;
	}
		
	public static Map<String, String> getAllPropertyTypes(String response, String entitySetlName, String namespaceURIForProperty,
			String namespaceURIForEntityType) throws Exception {
		return object(CLAZZ)._getAllPropertyTypes(response, entitySetlName, namespaceURIForProperty, namespaceURIForEntityType);
	}

	protected Map<String, String> _getAllPropertyTypes(String response, String entitySetlName, String namespaceURIForProperty,
			String namespaceURIForEntityType) throws Exception {
		Document metaXml = parseXmlString(response);
		String entityTypeFullName = object(CLAZZ).getEntityTypeFullName(metaXml, entitySetlName, namespaceURIForEntityType);
		return object(CLAZZ).getAllPropertyTypes(metaXml, entityTypeFullName, namespaceURIForProperty);
	}

	protected Document parseXmlString(String xmlText) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();

		try (InputStream is = new ByteArrayInputStream(xmlText.getBytes(StandardCharsets.UTF_8))) {
			return builder.parse(is);
		}
	}

}