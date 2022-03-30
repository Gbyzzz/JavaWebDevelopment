package by.gbyzzz.task07webxmlparsing.service;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.ParseException;

public interface ParseXML {
    void parse(String args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException;
}
