package by.gbyzzz.task01javalinear.view;

import by.gbyzzz.task01javalinear.controller.taskoneimpl.*;

import java.io.IOException;


public class TaskOneMenu {
    Triangle triangle = new Triangle();
    Average average = new Average();
    AverageCubed averageCubed = new AverageCubed();
    Expression expression = new Expression();
    Boat boat = new Boat();
    public void start(int taskSelect, int sourceSelect) throws IOException {
        switch (taskSelect) {
            case 1:
                triangle.input(sourceSelect);
                triangle.calculations();
                triangle.consoleOutput();
                break;
            case 2:
                average.input(sourceSelect);
                average.calculations();
                average.consoleOutput();
                break;
            case 3:
                boat.input(sourceSelect);
                boat.calculations();
                boat.consoleOutput();
                break;
            case 4:
                averageCubed.input(sourceSelect);
                averageCubed.calculations();
                averageCubed.consoleOutput();
                break;
            case 5:
                expression.input(sourceSelect);
                expression.calculations();
                expression.consoleOutput();
                break;
        }
    }
}


