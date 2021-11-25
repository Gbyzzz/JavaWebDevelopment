package by.gbyzzz.task01javalinear.view;

public class Menu {
    static IOData io = new IOData();
    public void mainMenu(){
        io.output("Hello! You've just started my program, please select the task which you want to launch");
        io.output("1. Task 1");
        io.output("2. Task 2");
        io.output("3. Task 3");
        io.output("4. Exit");
        io.output("Please input № of task (1-4)");
    }
    public void taskOneMenu(){
        io.output("1. Isosceles triangle (19)");
        io.output("2. The arithmetic mean of two numbers (5)");
        io.output("3. Boat (31)/n");
        io.output("4. The arithmetic mean of two qubed numbers (17)");
        io.output("5. z = 2 * x + ( y – 2 ) * 5 (3)");
        io.output("6. Exit");
        io.output("Please input № of task (1-6)");
    }
    public void taskTwoMenu() {
        io.output("1. Q-ty of positive numbers (19)");
        io.output("2. Comparison of two numbers (5)");
        io.output("3. The brick and the hole (31)/n");
        io.output("4. Task with two numbers (17)");
        io.output("5. Comparison of your number with '3' (3)");
        io.output("6. Exit");
        io.output("Please input № of task (1-6)");

    }
    public void taskThreeMenu() {
        io.output("1. Isosceles triangle (19)");
        io.output("2. The arithmetic mean of two numbers (5)");
        io.output("3. Boat (31)/n");
        io.output("4. The arithmetic mean of two qubed numbers (17)");
        io.output("5. z = 2 * x + ( y – 2 ) * 5 (3)");
        io.output("6. Exit");
        io.output("Please input № of task (1-6)");
    }
    public void sourceMenu(){
        io.output("Please choose the source:");
        io.output("1. Manual input");
        io.output("2. Input data from file");
        io.output("3. Go back to previous menu");
        io.output("Please enter a valid number between 1 and 3: ");
    }
}
