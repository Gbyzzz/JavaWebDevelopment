package by.gbyzzz.task06chainofresponsibility.service.interpreter;

import by.gbyzzz.task06chainofresponsibility.service.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ExpressionCalculator implements Service {
    private static final Logger LOGGER = LogManager.getLogger();

    public String calculate(String str) {
        Context context = new Context();
        BitOperation bitOperation;
        LOGGER.info("Calculating expression in text");

        String[] expressions = str.split("\\s");
        for (String expression : expressions) {
            switch (expression) {
                case "~":
                    bitOperation = (context1) -> context1.pushValue(~context1.popValue());
                    bitOperation.interpret(context);
                    break;
                case "&":
                    bitOperation = context1 -> {
                        int second = context1.popValue();
                        int first = context1.popValue();
                        context1.pushValue(first & second);
                    };
                    bitOperation.interpret(context);
                    break;
                case "|":
                    bitOperation = context1 -> {
                        int second = context1.popValue();
                        int first = context1.popValue();
                        context1.pushValue(first | second);
                    };
                    bitOperation.interpret(context);
                    break;
                case "^":
                    bitOperation = context1 -> {
                        int second = context1.popValue();
                        int first = context1.popValue();
                        context1.pushValue(first ^ second);
                    };
                    bitOperation.interpret(context);
                    break;
                case ">>":
                    bitOperation = context1 -> {
                        int second = context1.popValue();
                        int first = context1.popValue();
                        context1.pushValue(first >> second);
                    };
                    bitOperation.interpret(context);
                    break;
                case ">>>":
                    bitOperation = context1 -> {
                        int second = context1.popValue();
                        int first = context1.popValue();
                        context1.pushValue(first >>> second);
                    };
                    bitOperation.interpret(context);
                    break;
                case "<<":
                    bitOperation = context1 -> {
                        int second = context1.popValue();
                        int first = context1.popValue();
                        context1.pushValue(first << second);
                    };
                    bitOperation.interpret(context);
                    break;
                default:
                    Scanner sc = new Scanner(expression);
                    if (sc.hasNextInt()) {
                        BitOperation num = (context1) -> context1.pushValue(Integer.parseInt(expression));
                        num.interpret(context);
                    } else {
                        LOGGER.error("Incorrect symbol find");
                        throw new IllegalArgumentException("Incorrect symbol find");
                    }
            }

        }
        String res = String.valueOf(context.popValue());
        return res;
    }
}

