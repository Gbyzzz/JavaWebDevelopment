package by.gbyzzz.task07webxmlparsing.service;

import by.gbyzzz.task07webxmlparsing.dao.DAOFactory;
import by.gbyzzz.task07webxmlparsing.entity.User;
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
public class ParseXMLSAXImpl implements ParseXML{
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void parse(String XMLFile) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, ParseException {
        List<User> users = new ArrayList<>();
//        if(validator.validate(XMLFile)) {
        DAOFactory factory = DAOFactory.getInstance();
        Repository<User> repository = UserRepository.getRepository();
        LOGGER.info("Parsing xml file using SAX parser");
        factory.getSaxParser().parseXML(XMLFile, users);
        for(User user : users){
            repository.createOrUpdate(user);
        }
        //        } else {
//            System.out.println("file not valid");
////            LOGGER.error("XML file is not valid");
//        }
    }
}
