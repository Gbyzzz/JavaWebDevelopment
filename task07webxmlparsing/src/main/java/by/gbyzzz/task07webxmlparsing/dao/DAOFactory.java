package by.gbyzzz.task07webxmlparsing.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Locale;

public class DAOFactory {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final DAOFactory factory = new DAOFactory();
    public static DAOFactory getInstance(){
    return factory;
    }
    private XMLParser domParser = new DOMParser();
    private XMLParser saxParser = new SAXMLParser();
    private XMLParser staxParser = new StAXParser();

    public XMLParser getParser(String parser){
    XMLParser calledParser = null;
    switch (parser.toUpperCase(Locale.ROOT)){
        case "DOM":
            calledParser = domParser;
            break;
        case "SAX":
            calledParser = saxParser;
            break;
        case "STAX":
            calledParser = staxParser;
            break;
        default:
            LOGGER.error("Unknown parser selected");
    }
    return calledParser;
}
}
