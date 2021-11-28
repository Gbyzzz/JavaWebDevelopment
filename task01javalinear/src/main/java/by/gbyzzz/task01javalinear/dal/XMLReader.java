package by.gbyzzz.task01javalinear.dal;

import com.sun.corba.se.impl.encoding.CDROutputObject;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class XMLReader extends DefaultHandler{
//
//        public void read(int i) throws ParserConfigurationException, SAXException, IOException {
//        SAXParserFactory factory = SAXParserFactory.newInstance();
//        SAXParser parser = factory.newSAXParser();
//
//            XMLHandler handler = new XMLHandler();
//            parser.parse(new File("resource/data/numbers.xml"), handler);
//        }
//
//    private static class XMLHandler extends DefaultHandler {
//        @Override
//        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//            if (qName.equals("number")) {
//                double num = (double) attributes.getValue("num");
//            }
//        }
//    }
}
