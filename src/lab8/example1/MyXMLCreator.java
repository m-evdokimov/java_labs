package lr8.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class MyCreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("tasks");
            doc.appendChild(rootElement);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Ява"));
            task1.appendChild(name1);

            Element singer1 = doc.createElement("singer");
            singer1.appendChild(doc.createTextNode("Кино"));
            task1.appendChild(singer1);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Группа крови"));
            task2.appendChild(name2);

            Element singer2 = doc.createElement("singer");
            singer2.appendChild(doc.createTextNode("Сектор газа"));
            task2.appendChild(singer2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/lr8/example1/my_example.xml"));
            transformer.transform(source, result);
            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}