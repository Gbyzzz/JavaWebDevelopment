package by.gbyzzz.task07webxmlparsing.dao;

import by.gbyzzz.task07webxmlparsing.entity.Admin;
import by.gbyzzz.task07webxmlparsing.entity.Bartender;
import by.gbyzzz.task07webxmlparsing.entity.User;
import by.gbyzzz.task07webxmlparsing.entity.Users;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anton Pinchuk
 */
public class DataProvider {
    static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static List<Users> users;

    static {
        try {
            users = Arrays.asList(new Admin(1L, "Admin", "Tom", "Smith", "08763856313", "admin@bar.com", "Admin", true, format.parse("2002-03-23")),
            new Admin(2L, "Admin1", "John", "Cole", "0689984689", "admin1@bar.com", "Admin", true, format.parse("2002-03-23")),
            new Bartender(3L, "LuckyBartender", "Sam", "Green", null, "samgreen@bar.com", "Bartender", true, format.parse("2002-03-23")),
            new User(4L, "Jspm", null, null, null, "alcoholfan2010@gmail.com", "User", true, format.parse("2002-03-23")),
            new Bartender(5L, "JDaniels", "John", null, null, "jdaniels1985@yahoo.com", "Bartender", true, format.parse("2002-03-23")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
