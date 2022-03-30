package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.User;
import by.gbyzzz.task07webxmlparsing.entity.Users;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * @author Anton Pinchuk
 */
public class DOMParserTest {

    @Test(groups = "1")
    public void testParseXML() throws XMLStreamException, ParserConfigurationException, IOException, ParseException, SAXException {
        DAOFactory factory = DAOFactory.getInstance();

        List<Users> actual = new ArrayList<>();

        factory.getParser("DOM").parseXML(getClass().getClassLoader().getResource("users.xml").getPath(), actual);

        assertEquals(actual, DataProvider.users);
    }
}