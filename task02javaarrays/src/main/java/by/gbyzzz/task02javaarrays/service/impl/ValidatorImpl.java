package by.gbyzzz.task02javaarrays.service.impl;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.ValidatorService;

import java.util.Scanner;

/**
 * This class validates the input of user in console.
 * @author Anton Pinchuk
 *
 */

public final class ValidatorImpl implements ValidatorService {

    /**
     * rangeInt method checks if the user inputs an integer between min and max
     * parameters. If it's not, user got a warning and inputs again. This cycle
     * works until user inputs right number.
     * @param max max number
     * @param min min number
     * @param in input from the user
     * @return user's right number
     */

    @Override
    public int rangeInt(final Scanner in, final int min, final int max) {
        int res = 0;
        while (true) {
            if (in.hasNextInt()) {
                res = in.nextInt();
                if (res <= max && res >= min) {
                    break;
                }

            } else {
                in.next();
            }
            System.out.println("Invalid Input. Please enter a valid number between " + min + " and " + max + ":");
        }
        return res;
    }

    /**
     * oddInt method checks if the user inputs odd integer. If it's not, user got
     * a warning and inputs again. This cycle works until user inputs right number.
     * @param in input from the user
     * @return user's right number
     */

    public int oddInt(final Scanner in, int min) {
        int res;
        while (true) {
            if (in.hasNextInt()) {
                res = in.nextInt();
                if (res % 2 == 1) {
                    if (res > min) {
                        break;
                    }
                }
            } else {
                in.next();
            }
            System.out.println("Invalid Input. Please enter a valid number");
        }
        return res;
    }

    /**
     * fromNum method checks if the user inputs a number that bigger than parameter min.
     * If it's not, user got a warning and inputs again. This cycle works until user
     * inputs right number.
     * @param min min number
     * @param in input from the user
     * @return user's right number
     */

    public double fromNum(final Scanner in, final double min) {

        double res;
        while (true) {
            if (in.hasNextDouble()) {
                res = in.nextDouble();
                if (res > min) {
                    break;
                }
            } else if (in.hasNextInt()) {
                    res = in.nextInt();
                    if (res > min) {
                        break;
                    }
                } else {
                    in.next();
                }
            System.out.println("Invalid Input. Please enter a valid number bigger than " + min + ":");
            }

        return res;
    }

    /**
     * doubleNum method checks if the user inputs a number. If it's not, user got a warning
     * and inputs again. This cycle works until user inputs right number.
     * @param in input from the user
     * @return user's right number
     */

    public double doubleNum(final Scanner in) {
        double res;
        while (true) {
            if (in.hasNextDouble()) {
                res = in.nextDouble();
                break;
            } else {
                if (in.hasNextInt()) {
                    res = in.nextInt();
                    break;
                } else {
                    in.next();
                }
            }
            System.out.println("Invalid Input. Please enter a valid number");
        }
        return  res;
    }

    /**
     * intNum method checks if the user inputs an integer. If it's not, user got a warning
     * and inputs again. This cycle works until user inputs right number.
     * @param in input from the user
     * @return user's right number
     */

    public int intNum(final Scanner in) {
        int res;
        while (true) {
            if (in.hasNextInt()) {
                res = in.nextInt();
                break;
            } else {
                in.next();
            }

            System.out.println("Invalid Input. Please enter a valid number");
        }
        return  res;
    }
    @Override
    public boolean matrixSizeEquals(MyArray arr1, MyArray arr2) {
        boolean res = false;
        if(arr1.getArr().length == arr2.getArr().length && arr1.getArr()[0].length == arr2.getArr()[0].length)
        res = true;
        return res;
    }

    @Override
    public boolean matrixEqualsForMult(MyArray arr1, MyArray arr2) {
        boolean res = false;
        if(arr1.getArr()[0].length == arr2.getArr().length)
            res = true;
        return res;
    }
}
