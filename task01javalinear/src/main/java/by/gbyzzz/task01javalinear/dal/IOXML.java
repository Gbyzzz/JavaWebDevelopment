package by.gbyzzz.task01javalinear.dal;

import by.gbyzzz.task01javalinear.entity.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * This class reads data from a xml file and converts it to the
 * type specified in the arg.
 * @author Anton Pinchuk
 *
 */

public final class IOXML {
    private static final Logger LOGGER = LogManager.getLogger();
    public Data readXML(final String arg) {
        final Data num = new Data();
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) throws SAXException {
                if (qName.equals("number")) {
                    switch (arg) {
                        case "int":
                            LOGGER.debug("Parsing integer from XML file");
                            num.add(Integer.parseInt(attributes.getValue("num")));
                            break;
                        case "double":
                            LOGGER.debug("Parsing double from XML file");
                            num.add(Double.parseDouble(attributes.getValue("num")));
                            break;
                        default:
                            break;
                    }
                }
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException e) {
            LOGGER.error("ParserConfigurationException error");
            e.printStackTrace();
        } catch (SAXException e) {
            LOGGER.error("SAXException error");
            e.printStackTrace();
        }

        try {
            LOGGER.debug("Parsing XML file");
            parser.parse(new File("task01javalinear/src/main/resources/data/numbers.xml"), handler);
        } catch (SAXException e) {
            LOGGER.error("SAXException error");
            e.printStackTrace();
        } catch (IOException e) {
            LOGGER.error("IOException error");
            e.printStackTrace();
        }

        return num;
    }
}