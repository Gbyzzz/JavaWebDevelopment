package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * @author Anton Pinchuk
 */
public class SAXParserTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test(groups = "1")
    public void testParseXML() throws XMLStreamException, ParserConfigurationException, IOException, ParseException, SAXException {
        DAOFactory factory = DAOFactory.getInstance();

        List<User> actual = new ArrayList<>();
        factory.getSaxParser().parseXML(getClass().getClassLoader().getResource("users.xml").getPath(), actual);
        assertEquals(actual, DataProvider.users);
    }
}