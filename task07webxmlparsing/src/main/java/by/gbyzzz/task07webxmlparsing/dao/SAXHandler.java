package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.Admin;
import by.gbyzzz.task07webxmlparsing.entity.Bartender;
import by.gbyzzz.task07webxmlparsing.entity.User;
import by.gbyzzz.task07webxmlparsing.entity.Users;
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
    List<Users> result;
    Users user;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");


    public List<Users> getResult() {
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

        if (qName.equalsIgnoreCase("admin")) {
            user = new Admin("Admin");
            String id = attributes.getValue("id");
            user.setUserId(Long.valueOf(id));
            String name = attributes.getValue("name");
            user.setName(name);
            String surname = attributes.getValue("surname");
            user.setSurname(surname);
        } else if (qName.equalsIgnoreCase("bartender")) {
            user = new Bartender("Bartender");
            String id = attributes.getValue("id");
            user.setUserId(Long.valueOf(id));
            String name = attributes.getValue("name");
            user.setName(name);
            String surname = attributes.getValue("surname");
            user.setSurname(surname);
        } else if (qName.equalsIgnoreCase("user")) {
            user = new User("User");
            String id = attributes.getValue("id");
            user.setUserId(Long.valueOf(id));
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

        if (qName.equalsIgnoreCase("user") || qName.equalsIgnoreCase("bartender") ||
                qName.equalsIgnoreCase("admin")) {
            result.add(user);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        currentValue.append(ch, start, length);

    }

}