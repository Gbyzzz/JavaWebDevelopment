package by.gbyzzz.task02javaarrays.view.impl;

import by.gbyzzz.task01javalinear.service.InputValidator;
import by.gbyzzz.task02javaarrays.view.IOData;

import java.util.Scanner;

/**
 * This class performs input and output through console.
 * @author Anton Pinchuk
 *
 */

public final class IODataImpl implements IOData {

    private InputValidator inputValidator = new InputValidator();

    public void output(final String arg) {
        System.out.println(arg);
    }

    public void output(final int arg) {
        System.out.println(arg);
    }

    public void output(final double arg) {
        System.out.println(arg);
    }

    /**
     * output method outputs to the console text with a number argument.
     * @param label max number
     * @param arg number
     */

    public void output(final String label, final double arg) {
        System.out.print(label);
        System.out.printf("%.2f" + "\n", arg);
    }

    /**
     * output method outputs to the console text with two number arguments.
     * @param label max number
     * @param arg number
     * @param arg1 number
     */

    public void output(final String label, final double arg, final double arg1) {
        System.out.print(label);
        System.out.printf("%.2f" + "\n", arg, arg1);
    }

    /**
     * output method outputs to the console text with two number arguments.
     * @param label max number
     * @param arg number
     * @param arg1 number
     * @param arg2 number
     */

    public void output(final String label, final double arg, final double arg1, double arg2) {
        System.out.print(label);
        System.out.printf("%.2f" + "\n", arg, arg1, arg2);
    }

    /**
     * input method reads input of the user from the console and validates it
     * according to the arg parameter.
     * @param arg parameter for InputValidator method
     * @param a number
     * @param b number
     * @return user's input
     * @see InputValidator
     */

    public int input(final String arg, final int a, final int b) {
        int res = 0;
        Scanner in = new Scanner(System.in);
        switch (arg) {
            case "odd":
                res = inputValidator.oddInt(in, a);
                break;
            case "range":
                res = inputValidator.rangeInt(in, a, b);
                break;
            default:
                break;
        }

        return res;
    }

    /**
     * input method reads input of the user from the console and validates if
     * it's a number.
     * @return user's input
     * @see InputValidator
     */

    public double input() {
        Scanner in = new Scanner(System.in);
        double res = inputValidator.doubleNum(in);
        return res;
    }

    /**
     * input method reads input of the user from the console and validates if
     * it's a number bigger than min parameter.
     * @param min min number
     * @return user's input
     * @see InputValidator
     */

    public double input(final double min) {
        Scanner in = new Scanner(System.in);
        double res = inputValidator.fromNum(in, min);
        return res;
    }

    /**
     * input method reads input of the user from the console and validates if
     * it's an integer.
     * @return user's input
     * @see InputValidator
     */

    public int inputInt() {
        Scanner in = new Scanner(System.in);
        int res = inputValidator.intNum(in);
        return res;
    }
}




