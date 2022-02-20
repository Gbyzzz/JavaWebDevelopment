package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;
import by.gbyzzz.task06chainofresponsibility.bean.StringLeaf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser extends TextParser{

    @Override
    public void parseText(Component textComposite , String text) {
        String[] paragraphs = text.split(System.lineSeparator());
        for (String paragraph : paragraphs) {
            paragraph = paragraph.trim();
            if (super.nextTextParser!=null) {
                Component paragraphComposite=new Composite(PartLevel.PARAGRAPH);
                super.nextTextParser.parse(paragraphComposite, paragraph);
                textComposite.add(paragraphComposite);
            } else {
                Component paragraphComposite=new StringLeaf(paragraph, PartLevel.PARAGRAPH);
                textComposite.add(paragraphComposite);
            }
        }
    }
}
