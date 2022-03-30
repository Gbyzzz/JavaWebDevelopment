package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.User;
import by.gbyzzz.task07webxmlparsing.entity.Users;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface XMLParser {
    void parseXML(String XMLFile, List<Users> users) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException;
}
