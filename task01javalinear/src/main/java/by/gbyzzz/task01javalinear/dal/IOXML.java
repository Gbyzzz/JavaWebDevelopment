package by.gbyzzz.task01javalinear.dal;

import by.gbyzzz.task01javalinear.entity.Data;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class IOXML {
    public Data readXML() throws ParserConfigurationException, SAXException, IOException {
        final Data num = new Data();
    DefaultHandler handler = new DefaultHandler(){
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("number")) {
            num.add(Double.parseDouble(attributes.getValue("num")));
           }
        }
    };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        parser.parse(new File("task01javalinear/src/main/resources/data/numbers.xml"), handler);

        return num;
    }
}

