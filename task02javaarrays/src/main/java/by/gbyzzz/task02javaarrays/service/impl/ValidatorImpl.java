package by.gbyzzz.task02javaarrays.service.impl;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.view.MenuText;

import java.util.Scanner;

/**
 * This class validates the input of user in console.
 * @author Anton Pinchuk
 *
 */

public final class ValidatorImpl implements ValidatorService {
    MenuText menuText = new MenuText();

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
            menuText.invalidInput(min, max);
        }
        return res;
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
