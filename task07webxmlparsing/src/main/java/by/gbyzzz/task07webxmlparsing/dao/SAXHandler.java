package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.User;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anton Pinchuk
 */
public class SAXHandler extends DefaultHandler {

    private StringBuilder currentValue = new StringBuilder();
    List<User> result;
    User user;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");


    public List<User> getResult() {
        return result;
    }

    @Override
    public void startDocument() {
        result = new ArrayList<>();
    }

    @Override
    public void startElement(
            String uri,
            String localName,
            String qName,
            Attributes attributes) {
        currentValue.setLength(0);

        if (qName.equalsIgnoreCase("user")) {
            user = new User();

            String id = attributes.getValue("id");
            user.setUserId(Long.valueOf(id));
            String role = attributes.getValue("role");
            user.setRole(role);
            String name = attributes.getValue("name");
            user.setName(name);
            String surname = attributes.getValue("surname");
            user.setSurname(surname);
        }

    }

    @Override
    public void endElement(String uri,
                           String localName,
                           String qName) {

        if (qName.equalsIgnoreCase("username")) {
            user.setUsername(currentValue.toString());
        }

        if (qName.equalsIgnoreCase("phone")) {
            user.setPhone(currentValue.toString());
        }

        if (qName.equalsIgnoreCase("email")) {
            user.setEmail(currentValue.toString());
        }

        if (qName.equalsIgnoreCase("is_active")) {
            user.setIsActive(Boolean.valueOf(currentValue.toString()));
        }

        if (qName.equalsIgnoreCase("reg_date")) {
            try {
                user.setRegDate(formatter.parse(currentValue.toString().trim()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if (qName.equalsIgnoreCase("user")) {
            result.add(user);
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) {
        currentValue.append(ch, start, length);

    }

}