package by.gbyzzz.task07webxmlparsing.entity;

import java.util.Date;

/**
 * @author Anton Pinchuk
 */
public class Bartender extends Users{
    public Bartender(String role) {
        super(role);
    }

    public Bartender(Long userId, String username, String name, String surname, String phone, String email, String role, Boolean isActive, Date regDate) {
        super(userId, username, name, surname, phone, email, role, isActive, regDate);
    }
}
