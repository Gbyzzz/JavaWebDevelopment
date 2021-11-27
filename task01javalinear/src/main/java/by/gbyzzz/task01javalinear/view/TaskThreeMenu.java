package by.gbyzzz.task01javalinear.view;

import by.gbyzzz.task01javalinear.controller.taskthreeimpl.MultiplyTable;
import by.gbyzzz.task01javalinear.controller.taskthreeimpl.RowMultiply;
import by.gbyzzz.task01javalinear.controller.taskthreeimpl.RowOfNums;
import by.gbyzzz.task01javalinear.controller.taskthreeimpl.SumNinetyNine;

import java.io.IOException;

public class TaskThreeMenu {
    SumNinetyNine sumNinetyNine = new SumNinetyNine();
    RowMultiply rowMultiply = new RowMultiply();
    MultiplyTable multiplyTable = new MultiplyTable();
    RowOfNums rowOfNums = new RowOfNums();

    public void start(int taskSelect, int sourceSelect) throws IOException {
        switch (taskSelect) {
            case 1:
                rowOfNums.input(sourceSelect);
                rowOfNums.calculations();
                rowOfNums.consoleOutput();
                break;
            case 2:
                sumNinetyNine.calculations();
                sumNinetyNine.consoleOutput();
                break;
            case 3:

                break;
            case 4:
                rowMultiply.input(sourceSelect);
                rowMultiply.calculations();
                rowMultiply.consoleOutput();
                break;
            case 5:
                multiplyTable.input(sourceSelect);
                multiplyTable.calculations();
                multiplyTable.consoleOutput();
                break;
        }
    }
}
