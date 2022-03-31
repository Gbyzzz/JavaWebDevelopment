package by.gbyzzz.task07webxmlparsing.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * @author Anton Pinchuk
 */
public class XMLValidator {

    private static final XMLValidator validator = new XMLValidator();

    public static XMLValidator getInstance(){
        return validator;
    }

    private XMLValidator() {
    }

    private static final Logger LOGGER = LogManager.getLogger();

    public boolean validate(String xmlPath) throws SAXNotSupportedException, SAXNotRecognizedException {
        File schemaFile = new File(getClass().getClassLoader().getResource("users.xsd").getPath());
        boolean valid = false;
        Source xmlFile = new StreamSource(new File(xmlPath));
        SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        schemaFactory.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        try {
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator xmlValidator = schema.newValidator();
            xmlValidator.validate(xmlFile);
            valid = true;
        } catch (SAXException | IOException e) {
            LOGGER.error("file is not valid");
        }
        return valid;
    }
}
