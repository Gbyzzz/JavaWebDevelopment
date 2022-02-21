package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;


public class TextSorter {
    private static final Logger LOGGER = LogManager.getLogger();

    public ArrayList sortParagraphsBySentences(Component component) {
        LOGGER.info("Sorting paragraphs by sentences quantity");
        Comparator<Component> comparator = (o1, o2) -> {
            int first = o1.getParts().size();
            int second = o2.getParts().size();
            return Integer.compare(first, second);
        };
        ArrayList<Component> paragraphs = new ArrayList<>();
        paragraphs.addAll(component.getParts());
        Collections.sort(paragraphs, comparator);
        return paragraphs;
    }


    public ArrayList sortWordsInSentences(Component component) {
        LOGGER.info("Sorting words in sentences by length");
        ArrayList<Component> words = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();
        Comparator<Component> comparator = (o1, o2) -> {
            int first = o1.toString().length();
            int second = o2.toString().length();
            return Integer.compare(first, second);
        };
        for (Component paragraph : component.getParts()) {
            for (Component sentence : paragraph.getParts()) {
                    words = sentence.getParts();
                    Collections.sort(words, comparator);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (Component component1 : words){
                        stringBuilder.append(component1.toString() + " ");
                    }
                    sentences.add(stringBuilder.toString());
            }
        }
        return sentences;
    }

    public StringBuilder sortLexemes(Component component, char c) {
        LOGGER.info("Sorting lexemes in whole text");
        ArrayList<Component> tempList = new ArrayList<>();
        for (Component paragraph : component.getParts()) {
            for (Component sentence : paragraph.getParts()) {
                tempList.addAll(sentence.getParts());
            }
        }
        Comparator<Component> comparatorOccurrences = (Comparator) (o1, o2) -> Long.compare(o1.toString().
                toLowerCase(Locale.ROOT).codePoints().filter(ch -> ch == c).count(),o2.toString().
                toLowerCase(Locale.ROOT).codePoints().filter(ch -> ch == c).count());
        Comparator<Component> comparatorAlphabetical = (Comparator) (o1, o2) -> o1.toString().compareTo(o2.toString());
        Collections.sort(tempList, comparatorOccurrences.thenComparing(comparatorAlphabetical));
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component1 : tempList){
            stringBuilder.append(component1.toString() + " ");
        }
        return stringBuilder;
    }
}




