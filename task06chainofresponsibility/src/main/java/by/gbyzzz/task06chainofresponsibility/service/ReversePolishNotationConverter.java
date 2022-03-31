package by.gbyzzz.task06chainofresponsibility.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotationConverter {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String NUMBER = "\\d+";
    private static final String REGEX="(?<=\\d)(?=\\D)|(?=\\d)(?<=\\D)|(((?=([~|^&()]))|(?<=([~|^&()]))))";

    public String convert(String expression) {
        LOGGER.info("Converting expression from text to reverse polish notation to make calculations");
        StringBuilder resultStr = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();
        String [] arr = expression.split(REGEX);

        for (String value : arr) {
            if (value.matches(NUMBER)) {
                resultStr.append(" ");
                resultStr.append(value);
            } else if (value.equals("(")) {
                stack.push(value);
            } else if (value.equals(")")) {
                while (true) {
                    String symbolFromStack = stack.pop();
                    if (symbolFromStack.equals("(")) {
                        break;
                    } else {
                        resultStr.append(" ");
                        resultStr.append(symbolFromStack);
                    }
                }
            } else {
                if (stack.isEmpty()) {
                    stack.push(value);
                } else {
                    int priorityOfSymbol = getSymbolPriority(value);
                    while (true) {
                        int priorityOfSymbolFromStack = getSymbolPriority(stack.getFirst());

                        if (priorityOfSymbol > priorityOfSymbolFromStack) {
                            stack.push(value);
                            break;
                        } else {
                            resultStr.append(" ");
                            resultStr.append(stack.pop());
                        }
                        if (stack.isEmpty()) {
                            stack.push(value);
                            break;
                        }
                    }
                }
            }
        }
        while (stack.size() > 0) {
            resultStr.append(" ");
            resultStr.append(stack.pop());
        }
        return resultStr.toString().trim();
    }

    private int getSymbolPriority(String operation) {
        switch (operation) {
            case "~":
                return 5;
            case "<<":
            case ">>":
            case ">>>":
                return 4;
            case "&":
                return 3;
            case "^":
                return 2;
            case "|":
                return 1;
            default:
                return 0;
        }
    }
}

