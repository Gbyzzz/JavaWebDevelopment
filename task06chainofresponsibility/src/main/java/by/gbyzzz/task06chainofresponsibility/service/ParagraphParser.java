package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;
import by.gbyzzz.task06chainofresponsibility.bean.StringLeaf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class ParagraphParser extends TextParser{
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void parseText(Component component , String text) {
        String mesArg = component.getPartLevel().toString().toLowerCase(Locale.ROOT);
        LOGGER.info("Parsing %s to paragraphs", mesArg);
        String[] paragraphs = text.split(System.lineSeparator());
        for (String paragraph : paragraphs) {
            paragraph = paragraph.trim();
            if (super.nextTextParser!=null) {
                Component paragraphComposite=new Composite(PartLevel.PARAGRAPH);
                super.nextTextParser.parse(paragraphComposite, paragraph);
                component.add(paragraphComposite);
            } else {
                Component paragraphComposite=new StringLeaf(paragraph, PartLevel.PARAGRAPH);
                component.add(paragraphComposite);
            }
        }
    }
}
