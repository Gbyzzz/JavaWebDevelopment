package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class WordParser extends TextParser {
    private static final Logger LOGGER = LogManager.getLogger();

    final String WORD_REGEX = "(?=\\p{Punct})|(?<=\\p{Punct})";

    @Override
    void parseText(Component component, String lexeme) {
        LOGGER.info("Parsing " + component.getPartLevel().toString().toLowerCase(Locale.ROOT) + " to words");
        String[] words = lexeme.split(WORD_REGEX);
        for(String word : words){
            if (word.length() == 1) {
                Component leaf = new Leaf(word.charAt(0), PartLevel.SYMBOL);
                component.add(leaf);
            } else {
                if (super.nextTextParser != null) {
                    Component wordComposite = new Composite(PartLevel.WORD);
                    component.add(wordComposite);
                    super.nextTextParser.parse(wordComposite, word);
                } else {
                    Component leaf = new StringLeaf(word, PartLevel.WORD);
                    component.add(leaf);
                }
            }
        }
//        while (matcher.find()) {
//            if (super.nextTextParser != null) {
//                lexeme = matcher.group().replaceAll("\\s+", " ").trim();
//                Component wordComposite = new Composite(PartLevel.SENTENCE);
//                super.nextTextParser.parse(sentenceComposite, lexeme);
//                component.add(sentenceComposite);
//            }
//        }
    }
}