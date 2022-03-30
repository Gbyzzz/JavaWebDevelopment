package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.User;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

/**
 * @author Anton Pinchuk
 */
public class SAXMLParser implements XMLParser{
    @Override
    public void parseXML(String XMLFile, List<User> users) throws ParserConfigurationException, IOException, SAXException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            SAXParser saxParser = factory.newSAXParser();

            SAXHandler handler = new SAXHandler();
            saxParser.parse(XMLFile, handler);

            users.addAll(handler.getResult());
    }
}