package by.gbyzzz.task06chainofresponsibility.service.interpreter;

import by.gbyzzz.task06chainofresponsibility.service.Service;

import java.util.Scanner;

public class ExpressionCalculator implements Service {

    public String calcExpression(String str) {
        Context context = new Context();
        BitOperation bitOperation;

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
                        throw new IllegalArgumentException("Incorrect symbol find");
                    }
            }

        }
        String res = String.valueOf(context.popValue());
        return res;
    }
}

