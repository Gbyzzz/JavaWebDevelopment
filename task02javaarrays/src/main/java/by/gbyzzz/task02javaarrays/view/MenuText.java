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
        io.output("5. Insertion sort(address)");
        io.output("6. Merge sort");
        io.output("7. Shell's sort");
        io.output("8. External sort");
        io.output("9. Exit");
        io.output(correctImputMsg);
    }
    public void matrixMenu() {
        io.output("1. Addition of two matrices");
        io.output("2. Subtraction of two matrices");
        io.output("3. Multiplication of two matrices");
        io.output("4. Exponentiation of matrix");
        io.output("5. Multiplication of matrix on number");
        io.output("6. Transpose of matrix on number");
        io.output("7. Exit");
        io.output(correctImputMsg);

    }

    public void backMenu() {
        io.output("1. Return to main menu");
        io.output("2. Exit");
        io.output("Please enter a valid number between 1 and 2: ");
    }

}
