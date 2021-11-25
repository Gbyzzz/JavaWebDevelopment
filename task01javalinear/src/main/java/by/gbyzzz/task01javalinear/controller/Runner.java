package by.gbyzzz.task01javalinear.controller;


import by.gbyzzz.task01javalinear.controller.impl.Numbers;
import by.gbyzzz.task01javalinear.controller.impl.Triangle;
import by.gbyzzz.task01javalinear.view.IOData;
import by.gbyzzz.task01javalinear.view.Menu;

import java.io.IOException;

public class Runner {
    static IOData io = new IOData();

    public static void main(String[] args) throws IOException {
        startMenu();
    }
    static void startMenu() throws IOException {

        Menu menu = new Menu();
        menu.mainMenu();
        int[] select = new int[3];
        select[0] = io.input(1, 4);
        if (select[0] == 4)
            System.exit(0);
        else if (select [0]== 1) {
            menu.taskOneMenu();
            select[1] = io.input(1, 6);
            if (select[1] == 6)
                System.exit(0);
            else {
                menu.sourceMenu();
                select[2] = io.input(1, 3);
            }
            if (select[2] == 3)
                startMenu();
            while (true) {
                if (select[2] == 2) {
                    io.output("Importing data from file has not been coded yet");
                    backMenu();
                } else {
                    if (select[1] == 1) {
                        Triangle triangle = new Triangle();
                        triangle.hrrs();
                        backMenu();
                    } else if (select[1] == 2) {
                        Numbers numbers = new Numbers();
                        numbers.avrage();
                        backMenu();

                    } else if (select[1] == 3) {
                        Numbers numbers = new Numbers();
                        numbers.boat();
                        backMenu();

                    } else if (select[1] == 4) {
                        Numbers numbers = new Numbers();
                        numbers.avrage3();
                        backMenu();

                    } else if (select[1] == 5) {
                        Numbers numbers = new Numbers();
                        numbers.expression();
                        backMenu();

                    }

                }
            }
        }
        else if(select[0] == 2){
            menu.taskTwoMenu();
        }

        else if(select[0] == 3){
            menu.taskThreeMenu();
        }
    }
    public static void backMenu() throws IOException {


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