package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TextSorter {

    public ArrayList sortParagraphsBySentences(Component component) {
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


    public ArrayList sortSentencesByLexemes(Component component) {
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




