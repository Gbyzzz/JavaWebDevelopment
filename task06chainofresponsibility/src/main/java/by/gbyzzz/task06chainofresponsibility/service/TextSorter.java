package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TextSorter {

    public Component sortParagraphsBySentences(Component component) {
        Comparator<Component> comparator = (o1, o2) -> {
            int first = o1.getParts().size();
            int second = o2.getParts().size();
            return Integer.compare(first, second);
        };
        Component temp = new Composite(PartLevel.TEXT);
        temp = component;
        ArrayList<Component> paragraphs = temp.getParts();
        Collections.sort(paragraphs, comparator);
        return temp;
    }


    public Component sortSentencesByLexemes(Component component) {
        Component temp = component;
        ArrayList<Component> words = new ArrayList<>();
        Comparator<Component> comparator = (o1, o2) -> {
            int first = o1.toString().length();
            int second = o2.toString().length();
            return Integer.compare(first, second);
        };
        for (Component paragraph : temp.getParts()) {
            for (Component sentence : paragraph.getParts()) {
                words.addAll(sentence.getParts());
                Collections.sort(words, comparator);
            }
        }
        return temp;
    }

    public Component sortLexemes(Component component, char c) {
        Component temp = new Composite(PartLevel.TEXT);
        ArrayList<Component> tempList = null;
        for (Component paragraph : temp.getParts()) {
            for (Component sentence : paragraph.getParts()) {
                tempList.addAll(sentence.getParts());
            }
        }
        Comparator<Component> comparatorOccurrences = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Long.compare(o1.toString().codePoints().filter(ch -> ch == c).count(),o2.toString().codePoints().filter(ch -> ch == c).count());
            }
        };
        Comparator<Component> comparatorAlphabetical = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        };
        Collections.sort(tempList, comparatorOccurrences.thenComparing(comparatorAlphabetical));
        for (Component component1 : tempList) {
                temp.add(component);
            }
        return temp;
    }
}




