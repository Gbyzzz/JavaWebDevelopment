package by.gbyzzz.task06chainofresponsibility.controller;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;
import by.gbyzzz.task06chainofresponsibility.dal.FileIOFactory;
import by.gbyzzz.task06chainofresponsibility.service.*;
import by.gbyzzz.task06chainofresponsibility.service.interpreter.ExpressionCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReversePolishNotationConverter rpn = new ReversePolishNotationConverter();
        ExpressionCalculator calculator = new ExpressionCalculator();
        FileIOFactory fileIO = FileIOFactory.getInstance();
        TextParser parser = new ParagraphParser();
        TextParser sParser = new SentenceParser();
        TextParser lParser = new LexemeParser();
        TextParser wParser = new WordParser();
        TextParser symParser = new SymbolParser();
        Component text = new Composite(PartLevel.TEXT);
        Component text1 = new Composite(PartLevel.TEXT);
        Component text2 = new Composite(PartLevel.TEXT);
        Component text3 = new Composite(PartLevel.TEXT);
        TextSorter operation = new TextSorter();


        String str = fileIO.getFileIO().readText("text.txt");
        parser.setNextTextParser(sParser);
        sParser.setNextTextParser(lParser);
        lParser.setNextTextParser(wParser);
        wParser.setNextTextParser(symParser);
        parser.parse(text, str);
        parser.parse(text1, str);
        parser.parse(text2, str);
        System.out.println(text);
        ArrayList<Component> arr = operation.sortParagraphsBySentences(text);
        for(Component component : arr) {
            System.out.println(component);
        }

        System.out.println();

        ArrayList<String> arr1 = operation.sortWordsInSentences(text1);
        for(String component : arr1) {
            System.out.println(component);
        }

        System.out.println();

       StringBuilder arr2 = operation.sortLexemes(text2, 'c');

            System.out.println(arr2);

//        System.out.println(text1);
//        text2 = operation.sortSentencesByLexemes(text);
//        System.out.println(text2);
//        lParser.parse(text3, str);
//        text3 = operation.sortSentencesByLexemes(text);
//
//        System.out.println(text3);

//        System.out.println(text);

//        String s1 = rpn.convert((~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78);

        System.out.println(5>>>7);
    }
}
