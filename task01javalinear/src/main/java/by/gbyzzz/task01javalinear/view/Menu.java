package by.gbyzzz.task01javalinear.view;

public class Menu {
    private static IOData io = new IOData();
    String correctImputMsg = "Please input № of task";
    public void mainMenu() {
        io.output("Hello! You've just started my program, please select the task which you want to launch");
        io.output("1. Task 1");
        io.output("2. Task 2");
        io.output("3. Task 3");
        io.output("4. Exit");
        io.output(correctImputMsg);
    }
    public void taskOneMenu() {
        io.output("1. Isosceles triangle (19)");
        io.output("2. The arithmetic mean of two numbers (5)");
        io.output("3. Boat (31)/n");
        io.output("4. The arithmetic mean of two qubed numbers (17)");
        io.output("5. z = 2 * x + ( y – 2 ) * 5 (3)");
        io.output("6. Exit");
        io.output(correctImputMsg);
    }
    public void taskTwoMenu() {
        io.output("1. Q-ty of positive numbers (19)");
        io.output("2. Comparison of two numbers (5)");
        io.output("3. The brick and the hole (31)/n");
        io.output("4. Task with two numbers (17)");
        io.output("5. Comparison of your number with '3' (3)");
        io.output("6. Exit");
        io.output(correctImputMsg);

    }
    public void taskThreeMenu() {
        io.output("1. a = 1 / 2^n + 1 / 3^n compare with 'e'(19)");
        io.output("2. Sum from 1 to 99 (5)");
        io.output("3. Guess game (31)/n");
        io.output("4. a(a+1)...(a+n-1) (17)");
        io.output("5. Table of multiply(3)");
        io.output("6. Exit");
        io.output(correctImputMsg);
    }
    public void sourceMenu() {
        io.output("Please choose the source:");
        io.output("1. Manual input");
        io.output("2. Input data from file");
        io.output("3. Input data from xml file");
        io.output("4. Go back to previous menu");
        io.output("Please enter a valid number between 1 and 3: ");
    }
}
