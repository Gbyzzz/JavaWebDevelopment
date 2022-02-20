package by.gbyzzz.task06chainofresponsibility.controller;

import by.gbyzzz.task06chainofresponsibility.bean.Component;
import by.gbyzzz.task06chainofresponsibility.bean.Composite;
import by.gbyzzz.task06chainofresponsibility.bean.PartLevel;
import by.gbyzzz.task06chainofresponsibility.dal.FileIOFactory;
import by.gbyzzz.task06chainofresponsibility.service.*;
import by.gbyzzz.task06chainofresponsibility.service.interpreter.ExpressionCalculator;

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
        Component text1;
        Component text2;
        Component text3 = new Composite(PartLevel.TEXT);
        TextSorter operation = new TextSorter();
//        String s = "((71-(2*i--*(3*(2-1/2*2)2)-10/2))++i)";
//        System.out.println(ppn.calcExpr(s));
//
        String s1 = "~(8^5|1&2<<(2|5>>2&71))|1200>>>3";
        System.out.println(s1);
        s1 = rpn.convert(s1);
        System.out.println(s1);
//        calculator.addOperation(s1);
        s1 = calculator.calcExpression(s1);
        System.out.println(s1);
        System.out.println();
        System.out.println(~(8^5|1&2<<(2|5>>2&71))|1200>>>3);
        String str = fileIO.getFileIO().readText("text.txt");
        System.out.println(str);
        parser.setNextTextParser(sParser);
        sParser.setNextTextParser(lParser);
        lParser.setNextTextParser(wParser);
        wParser.setNextTextParser(symParser);
        parser.parse(text, str);
        System.out.println(text);

        text1 = text;
        text1 = operation.sortParagraphsBySentences(text1);

//        System.out.println(text1);
//        text2 = operation.sortSentencesByLexemes(text);
//        System.out.println(text2);
//        lParser.parse(text3, str);
//        text3 = operation.sortSentencesByLexemes(text);
//
//        System.out.println(text3);

        System.out.println(text);
    }
}
