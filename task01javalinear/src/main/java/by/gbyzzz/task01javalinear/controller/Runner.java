package by.gbyzzz.task01javalinear.controller;


import by.gbyzzz.task01javalinear.entity.Numbers;
import by.gbyzzz.task01javalinear.entity.Triangle;
import by.gbyzzz.task01javalinear.view.IOData;

import java.io.IOException;

public class Runner {
    IOData io = new IOData();

    public static void main(String[] args) throws IOException {
        startMenu();
   }
    static void startMenu() throws IOException {
        IOData io = new IOData();

        io.output("Hello! You've just started my program, please select the task which you want to launch");
        io.output("1. Isosceles triangle (19)");
        io.output("2. The arithmetic mean of two numbers (5)");
        io.output("3. Boat (31)/n");
        io.output("4. The arithmetic mean of two qubed numbers (17)");
        io.output("5. z = 2 * x + ( y – 2 ) * 5 (3)");
        io.output("6. Exit");
        int select[] = new int[2];
        io.output("Please input № of task (1-6)");
        select[0] = io.input(1,6);
        if (select[0] == 6)
            System.exit(0);

        else {

            io.output("Please choose the source:");
            io.output("1. Manual input");
            io.output("2. Input data from file");
            io.output("3. Go back to previous menu");
            io.output("Please enter a valid number between 1 and 3: ");

            select[1] = io.input(1,3);
        }
        if (select[1] == 3)
            startMenu();
        while (true) {
            if (select[1] == 2) {
                io.output("Importing data from file has not been coded yet");
                backMenu();
            }else{
                if (select[0] == 1) {
                    Triangle triangle = new Triangle();
                    triangle.hrrs();
                    backMenu();
                }
                else if(select[0] == 2){
                    Numbers numbers = new Numbers();
                    numbers.avrage();
                    backMenu();

                }
                else if(select[0] == 3){
                    Numbers numbers = new Numbers();
                    numbers.boat();
                    backMenu();

                }
                else if(select[0] == 4){
                    Numbers numbers = new Numbers();
                    numbers.avrage3();
                    backMenu();

                }
                else if(select[0] == 5){
                    Numbers numbers = new Numbers();
                    numbers.expression();
                    backMenu();

                }

            }
        }
    }
    public static void backMenu() throws IOException {
        IOData io = new IOData();

        io.output("");
        io.output("1. Return to main menu");
        io.output("2. Exit");
        int select = io.input(1,2);
        if(select == 1) {
            startMenu();
        }
        else {
            System.exit(0);
        }
    }
}
