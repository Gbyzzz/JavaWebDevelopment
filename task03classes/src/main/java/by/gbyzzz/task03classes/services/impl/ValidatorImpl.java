package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.services.ValidatorService;
import by.gbyzzz.task03classes.view.MenuText;

import java.util.Scanner;

/**
 * This class validates the input of user in console.
 * @author Anton Pinchuk
 *
 */

public final class ValidatorImpl implements ValidatorService {
    private MenuText menuText = new MenuText();

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
}
