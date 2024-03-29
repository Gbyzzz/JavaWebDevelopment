package by.gbyzzz.task07webxmlparsing.service;

import by.gbyzzz.task07webxmlparsing.dao.DAOFactory;
import by.gbyzzz.task07webxmlparsing.entity.Users;
import by.gbyzzz.task07webxmlparsing.entity.repository.Repository;
import by.gbyzzz.task07webxmlparsing.entity.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anton Pinchuk
 */
public class ParseXMLImpl implements ParseXML {
    private static final Logger LOGGER = LogManager.getLogger();
    XMLValidator validator = XMLValidator.getInstance();

    @Override
    public void parse(String xmlFile, String parser) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException {
        List<Users> users = new ArrayList<>();
        if(validator.validate(xmlFile)) {
        DAOFactory factory = DAOFactory.getInstance();
        Repository<Users> repository = UserRepository.getRepository();
        LOGGER.info("Parsing xml file using DOM parser");
        factory.getParser(parser).parseXML(xmlFile, users);
        for (Users user : users) {
            repository.createOrUpdate(user);
        }
        } else {
            System.out.println("file not valid");
            LOGGER.error("XML file is not valid");
        }

    }
}
