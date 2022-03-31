package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;
import by.gbyzzz.task06chainofresponsibility.bean.StringLeaf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class SentenceParser extends TextParser {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String SENTENCE_REGEX = "(?=(\\.|\\?|\\!|\\;))|(?<=(\\.|\\?|\\!|\\;))";

    @Override
    public void parseText(Component component , String text) {
        String mesArg =  component.getPartLevel().toString().toLowerCase(Locale.ROOT);
        LOGGER.info("Parsing %s to sentences", mesArg);
        String[] sentences = text.split(SENTENCE_REGEX);
        for (int i = 0; i < sentences.length; i+=2) {
            sentences[i] = sentences[i] + sentences[i+1].trim();
            if (super.nextTextParser != null) {
                Component paragraphComposite=new Composite(PartLevel.SENTENCE);
                super.nextTextParser.parse(paragraphComposite, sentences[i]);
                component.add(paragraphComposite);
            } else {
                Component paragraphComposite=new StringLeaf(sentences[i], PartLevel.SENTENCE);
                component.add(paragraphComposite);
            }
        }
    }
}