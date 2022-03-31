package by.gbyzzz.task06chainofresponsibility.service;

import by.gbyzzz.task06chainofresponsibility.bean.*;
import by.gbyzzz.task06chainofresponsibility.service.interpreter.ExpressionCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser extends TextParser {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String LEXEME_REGEX="\\s";
    private static final String POLISH_POSTFIX_NOTATION_REGEX="~|\\^|\\&|\\<<|\\>>|\\>>>|\\|";

    @Override
    public void parseText(Component component , String text) {
        String mesArg = component.getPartLevel().toString().toLowerCase(Locale.ROOT);
        LOGGER.info("Parsing %s to lexemes", mesArg);
        ExpressionCalculator calculator = new ExpressionCalculator();
        ReversePolishNotationConverter rpn = new ReversePolishNotationConverter();
        String[] lexemes = text.split(LEXEME_REGEX);
        Pattern pattern = Pattern.compile(POLISH_POSTFIX_NOTATION_REGEX);
        for (String lexeme : lexemes) {
            lexeme = lexeme.trim();
            Matcher matcher = pattern.matcher(lexeme);
            if (matcher.find()) {
                lexeme = rpn.convert(lexeme);
                lexeme = calculator.calculate(lexeme);
            } if (lexeme.length() == 1) {
                Component leaf = new Leaf(lexeme.charAt(0), PartLevel.LEXEME);
                component.add(leaf);
            } else {
                if (super.nextTextParser != null) {
                    Component composite = new Composite(PartLevel.LEXEME);
                    super.nextTextParser.parse(composite, lexeme);
                    component.add(composite);
                } else {
                    Component composite = new StringLeaf(lexeme, PartLevel.LEXEME);
                    component.add(composite);
                }
            }
        }
    }
}
