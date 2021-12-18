package by.gbyzzz.task02javaarrays.view.impl;


import by.gbyzzz.task02javaarrays.view.IOData;

import java.util.Scanner;

/**
 * This class performs input and output through console.
 * @author Anton Pinchuk
 *
 */

public final class IODataImpl implements IOData {

   // private InputValidator inputValidator = new InputValidator();
    @Override
    public void output(final String arg) {
        System.out.println(arg);
    }

    @Override
    public void outputArr(Number [][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
//
//    @Override
//    public void outputArr(double [] arr) {
//        for (double a : arr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//        System.out.println();
//    }

    @Override
    public void output(final int arg) {
        System.out.println(arg);
    }
    @Override
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
     * input method reads input of the user from the console and validates if
     * it's a number.
     * @return user's input
     */
    @Override
    public Scanner input() {
        return new Scanner(System.in);
    }

}




