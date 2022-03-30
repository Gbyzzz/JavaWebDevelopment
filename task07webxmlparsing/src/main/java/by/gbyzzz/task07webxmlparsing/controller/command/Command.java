package by.gbyzzz.task07webxmlparsing.controller.command;

import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.ParseException;

public interface Command {
    public void execute(HttpServletRequest request) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException;
}
