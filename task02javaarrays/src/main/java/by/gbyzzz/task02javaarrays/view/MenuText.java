package by.gbyzzz.task02javaarrays.view;

import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

/**
 * This class contains menu outputs.
 * @author Anton Pinchuk
 *
 */

public final class MenuText {
    ViewFactory viewFactory = ViewFactory.getInstance();
    IOData io =  viewFactory.getIoData();
    private String correctImputMsg = "Please input № of task";
    public void mainMenu() {
        io.output("Hello! You've just started my program, please select the task which you want to launch");
        io.output("1. Array");
        io.output("2. Matrix");
        io.output("3. Exit");
        io.output(correctImputMsg);
    }
    public void arrayMenu() {
        io.output("Please select the method to sort your array");
        io.output("1. Bubble sort");
        io.output("2. Shaker sort");
        io.output("3. Selection sort");
        io.output("4. Insertion sort");
        io.output("5. Shell's sort");
        io.output("6. Merge sort");
        io.output("7. Exit");
        io.output(correctImputMsg);
    }
    public void matrixMenu() {
        io.output("1. Q-ty of positive numbers (19)");
        io.output("2. Comparison of two numbers (5)");
        io.output("3. The brick and the hole (31)/n");
        io.output("4. Task with two numbers (17)");
        io.output("5. Comparison of your number with '3' (3)");
        io.output("6. Exit");
        io.output(correctImputMsg);

    }

    public void backMenu() {
        io.output("1. Return to main menu");
        io.output("2. Exit");
        io.output("Please enter a valid number between 1 and 2: ");
    }

}
