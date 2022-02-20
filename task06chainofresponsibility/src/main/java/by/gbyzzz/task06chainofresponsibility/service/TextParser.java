package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;

public abstract class TextParser implements Service {
    TextParser nextTextParser;

    public void setNextTextParser(TextParser nextTextParser) {
        this.nextTextParser = nextTextParser;
    }

    public void parse(Component component, String str){
        parseText(component, str);
    }
   abstract void parseText(Component component, String str);
}
