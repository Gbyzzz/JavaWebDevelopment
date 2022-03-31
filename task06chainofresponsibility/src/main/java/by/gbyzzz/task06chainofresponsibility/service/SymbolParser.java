package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Leaf;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class SymbolParser extends TextParser{
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    void parseText(Component component, String str) {
        String mesArg = component.getPartLevel().toString().toLowerCase(Locale.ROOT);
        LOGGER.info("Parsing %s to symbols", mesArg);
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
                Component leaf=new Leaf(s.charAt(0),PartLevel.SYMBOL);
                component.add(leaf);
        }
    }
}
