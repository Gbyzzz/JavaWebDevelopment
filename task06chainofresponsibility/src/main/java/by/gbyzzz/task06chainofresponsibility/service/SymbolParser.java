package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Leaf;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;

public class SymbolParser extends TextParser{

    @Override
    void parseText(Component component, String str) {
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
                Component leaf=new Leaf(s.charAt(0),PartLevel.SYMBOL);
                component.add(leaf);
        }
    }
}
