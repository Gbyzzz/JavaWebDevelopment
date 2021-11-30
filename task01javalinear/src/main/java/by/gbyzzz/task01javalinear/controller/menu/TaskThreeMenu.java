package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.taskthreeimpl.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class TaskThreeMenu {
    SumMinMax sumMinMax = new SumMinMax();
    RowMultiply rowMultiply = new RowMultiply();
    MultiplyTable multiplyTable = new MultiplyTable();
    RowOfNums rowOfNums = new RowOfNums();
    Guess guess = new Guess();

    public void start(int taskSelect, int sourceSelect) throws IOException, ParserConfigurationException, SAXException {
        switch (taskSelect) {
            case 1:
                rowOfNums.input(sourceSelect);
                rowOfNums.calculations();
                rowOfNums.consoleOutput();
                break;
            case 2:
                sumMinMax.input(sourceSelect);
                sumMinMax.calculations();
                sumMinMax.consoleOutput();
                break;
            case 3:
                guess.input(sourceSelect);
                guess.calculations();
                guess.consoleOutput();
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
