package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.User;
import org.xml.sax.SAXException;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Anton Pinchuk
 */
public class StAXParser implements XMLParser{
    @Override
    public void parseXML(String XMLFile, List<User> users) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(XMLFile));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        User user = null;
        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                switch (startElement.getName().getLocalPart()) {
                    case "user":
                        user = new User();
                        Attribute id = startElement.getAttributeByName(new QName("id"));
                        if (id != null) {
                            user.setUserId(Long.valueOf(id.getValue()));
                        }
                        Attribute role = startElement.getAttributeByName(new QName("role"));
                        if (role != null) {
                            user.setRole(role.getValue());
                        }
                        Attribute name = startElement.getAttributeByName(new QName("name"));
                        if (name != null) {
                            user.setName(name.getValue());
                        }
                        Attribute surname = startElement.getAttributeByName(new QName("surname"));
                        if (surname != null) {
                            user.setSurname(surname.getValue());
                        }
                        break;
                    case "username":
                        nextEvent = reader.nextEvent();
                        user.setUsername(nextEvent.asCharacters().getData());
                        break;
                    case "phone":
                        nextEvent = reader.nextEvent();
                        user.setPhone(nextEvent.asCharacters().getData());
                        break;
                    case "email":
                        nextEvent = reader.nextEvent();
                        user.setEmail(nextEvent.asCharacters().getData());
                        break;
                    case "is_active":
                        nextEvent = reader.nextEvent();
                        user.setIsActive(Boolean.valueOf(nextEvent.asCharacters().getData()));
                        break;
                    case "reg_date":
                        nextEvent = reader.nextEvent();
                        user.setRegDate(formatter.parse(nextEvent.asCharacters().getData().trim()));
                        break;
                }
            }
            if (nextEvent.isEndElement()) {
                EndElement endElement = nextEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("user")) {
                    users.add(user);
                }
            }
        }
    }
}
