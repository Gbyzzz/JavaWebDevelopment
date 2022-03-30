package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.Admin;
import by.gbyzzz.task07webxmlparsing.entity.Bartender;
import by.gbyzzz.task07webxmlparsing.entity.User;
import by.gbyzzz.task07webxmlparsing.entity.Users;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DOMParser implements XMLParser {
    @Override
    public void parseXML(String xmlFile, List<Users> users) throws ParserConfigurationException, IOException, SAXException, ParseException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File(xmlFile));
        doc.getDocumentElement().normalize();
        doc.getDocumentElement().getNodeName();
        NodeList list1 = doc.getDocumentElement().getChildNodes();
        Users user = null;

        for (int temp1 = 0; temp1 < list1.getLength(); temp1++) {

            Node node1 = list1.item(temp1);

            if (node1.getNodeType() == Node.ELEMENT_NODE) {

                Element element = (Element) node1;

                switch (element.getTagName()) {
                    case "admin":
                        user = new Admin("Admin");
                        break;
                    case "bartender":
                        user = new Bartender("Bartender");
                        break;
                    case "user":
                        user = new User("User");
                        break;
                }
                NodeList list = doc.getElementsByTagName("user");

                for (int temp = 0; temp < list.getLength(); temp++) {

                    Node node = list.item(temp);

                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Long id = Long.valueOf(element.getAttribute("id"));
                        String name = element.getAttribute("name").length() > 0 ? element.getAttribute("name") : null;
                        String surname = element.getAttribute("surname").length() > 0 ? element.getAttribute("surname") : null;
                        String username = element.getElementsByTagName("username").item(0).getTextContent();
                        String phone = element.getElementsByTagName("phone").getLength() > 0 ?
                                element.getElementsByTagName("phone").item(0).getTextContent() : null;
                        String email = element.getElementsByTagName("email").item(0).getTextContent();
                        Boolean isActive = Boolean.valueOf(element.getElementsByTagName("is_active").item(0).getTextContent().trim());
                        Date regDate = formatter.parse(element.getElementsByTagName("reg_date").item(0).getTextContent().trim());

                        user.setAll(id, username, name, surname, phone, email, isActive, regDate);
                        users.add(user);
                    }
                }
            }
        }
    }
}
