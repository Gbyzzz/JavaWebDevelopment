package by.gbyzzz.task07webxmlparsing.controller.command.impl;

import by.gbyzzz.task07webxmlparsing.controller.command.Command;
import by.gbyzzz.task07webxmlparsing.service.ParseXMLImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author Anton Pinchuk
 */
public class ParseXML implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void execute(HttpServletRequest request) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException {
        String parser = String.valueOf(request.getAttribute("command"));
        LOGGER.info("Parsing xml file using %s parser", parser);
        new ParseXMLImpl().parse(String.valueOf(request.getAttribute("file")), parser);
    }
}
