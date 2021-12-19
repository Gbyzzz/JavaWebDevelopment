package by.gbyzzz.task02javaarrays.view;

import java.util.Locale;
import java.util.ResourceBundle;

public enum MessageManager {
    EN(ResourceBundle.getBundle("property.text", new Locale("en", "US"))),
    RU(ResourceBundle.getBundle("property.text", new Locale("ru", "RU")));
    private ResourceBundle bundle;
    MessageManager(ResourceBundle bundle) {
        this.bundle = bundle;
    }
    public String getString(String key) {
        return bundle.getString(key);
    }
    public static MessageManager setLocale() {
        Locale locale = Locale.getDefault();
        return MessageManager.valueOf(locale.getLanguage().toUpperCase());
    }

}