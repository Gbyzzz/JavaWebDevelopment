package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;
import by.gbyzzz.task06chainofresponsibility.bean.StringLeaf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends TextParser {
    final String SENTENCE_REGEX = "(?=(\\.|\\?|\\!|\\;))|(?<=(\\.|\\?|\\!|\\;))";

    @Override
    public void parseText(Component textComposite , String text) {
        String[] sentences = text.split(SENTENCE_REGEX);
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i] + sentences[i+1].trim();
            if (super.nextTextParser != null) {
                Component paragraphComposite=new Composite(PartLevel.SENTENCE);
                super.nextTextParser.parse(paragraphComposite, sentences[i]);
                textComposite.add(paragraphComposite);
            } else {
                Component paragraphComposite=new StringLeaf(sentences[i], PartLevel.SENTENCE);
                textComposite.add(paragraphComposite);
            }
            i++;
        }
    }

//    @Override
//    void parseText(Component component, String str) {
//        String text;
//        Pattern pattern = Pattern.compile(SENTENCE_REGEX);
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()) {
//            if (super.nextTextParser != null) {
//                text = matcher.group().replaceAll("\\s+", " ").trim();
//                Component composite = new Composite(PartLevel.SENTENCE);
//                super.nextTextParser.parse(composite, text);
//                component.add(composite);
//            } else {
//                Component paragraphComposite=new StringLeaf(text, PartLevel.PARAGRAPH);
//                text.add(paragraphComposite);
//            }
//        }
//    }
}
