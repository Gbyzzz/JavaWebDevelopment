package by.gbyzzz.task01javalinear.view;

import java.io.IOException;

public class StartMenu {
    public void start() throws IOException {
        IOData io = new IOData();
        TaskOneMenu taskOneMenu = new TaskOneMenu();
        TaskTwoMenu taskTwoMenu = new TaskTwoMenu();
        TaskThreeMenu taskThreeMenu = new TaskThreeMenu();
        BackMenu backMenu = new BackMenu();

        Menu menu = new Menu();
        menu.mainMenu();
        int[] select = new int[3];
        select[0] = io.input(1, 4);
        switch (select[0]) {
            case 4:
                System.exit(0);
            case 1:
                menu.taskOneMenu();
                select[1] = io.input(1, 6);
                menu.sourceMenu();
                select[2] = io.input(1, 4);
                taskOneMenu.start(select[1], select[2]);
                backMenu.start();
            case 2:
                menu.taskTwoMenu();
                select[1] = io.input(1, 6);
                menu.sourceMenu();
                select[2] = io.input(1, 4);
                taskTwoMenu.start(select[1], select[2]);
                backMenu.start();
            case 3:
                menu.taskThreeMenu();
                select[1] = io.input(1, 6);
                menu.sourceMenu();
                select[2] = io.input(1, 4);
                taskThreeMenu.start(select[1], select[2]);
                backMenu.start();
                }
        }
    }

