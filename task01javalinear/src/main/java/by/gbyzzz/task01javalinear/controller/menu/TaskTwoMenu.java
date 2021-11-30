package by.gbyzzz.task01javalinear.controller.menu;


import by.gbyzzz.task01javalinear.controller.tasktwoimpl.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class TaskTwoMenu {
PositiveNumCount positiveNumCount = new PositiveNumCount();
CompareTwoNums compareTwoNums = new CompareTwoNums();
PassOrNot passOrNot = new PassOrNot();
TaskWithTwoNums taskWithTwoNums = new TaskWithTwoNums();
CompareWithThree compareWithThree = new CompareWithThree();

    public void start(int taskSelect, int sourceSelect) throws IOException, ParserConfigurationException, SAXException {
        switch (taskSelect) {
            case 1:
                positiveNumCount.input(sourceSelect);
                positiveNumCount.calculations();
                positiveNumCount.consoleOutput();
                break;
            case 2:
                compareTwoNums.input(sourceSelect);
                compareTwoNums.calculations();
                compareTwoNums.consoleOutput();
                break;
            case 3:
                passOrNot.input(sourceSelect);
                passOrNot.calculations();
                passOrNot.consoleOutput();
                break;
            case 4:
                taskWithTwoNums.input(sourceSelect);
                taskWithTwoNums.calculations();
                taskWithTwoNums.consoleOutput();
                break;
            case 5:
                compareWithThree.input(sourceSelect);
                compareWithThree.calculations();
                compareWithThree.consoleOutput();
                break;
        }
    }
}
