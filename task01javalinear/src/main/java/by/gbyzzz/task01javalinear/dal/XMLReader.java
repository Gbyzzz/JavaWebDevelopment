package by.gbyzzz.task01javalinear.dal;

import by.gbyzzz.task01javalinear.entity.Data;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;

public class XMLReader {

    public XMLReader() throws ParserConfigurationException, SAXException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
    }
//    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//    DocumentBuilder builder = factory.newDocumentBuilder();
//    Document document = builder.parse(new File("src/main/resources/data/number.xml"));
//    NodeList printingElements = document.getDocumentElement().getElementsByTagName("number");
//    Data in = new Data();
//
//    public void XMLIn() {
//        for (int i = 0; i < printingElements.getLength(); i++) {
//            int type1 = 0;
//            Node employee = printingElements.item(i);
//            NamedNodeMap attributes = employee.getAttributes();
//            String section = attributes.getNamedItem("section").getNodeValue();
//            switch (attributes.getNamedItem("type").getNodeValue()) {
//                case ("book"):
//                    type1 = 1;
//                    break;
//                case ("mag"):
//                    type1 = 2;
//                    break;
//                case ("article"):
//                    type1 = 3;
//                    break;
//            }
//            String type = attributes.getNamedItem("type").getNodeValue();
//            String title = attributes.getNamedItem("title").getNodeValue();
//            int pages = Integer.parseInt(attributes.getNamedItem("pages").getNodeValue());
//            in.add(new Data());
//        }
//
//    }
}
