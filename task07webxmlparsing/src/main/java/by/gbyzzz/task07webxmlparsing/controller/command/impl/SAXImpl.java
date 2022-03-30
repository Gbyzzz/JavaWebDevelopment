package by.gbyzzz.task07webxmlparsing.controller.command.impl;

import by.gbyzzz.task07webxmlparsing.controller.command.Command;
import by.gbyzzz.task07webxmlparsing.service.ParseXMLSAXImpl;
import org.xml.sax.SAXException;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author Anton Pinchuk
 */
public class SAXImpl implements Command {
    @Override
    public void execute(HttpServletRequest request) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException {
        new ParseXMLSAXImpl().parse(String.valueOf(request.getAttribute("file")));
    }
}
