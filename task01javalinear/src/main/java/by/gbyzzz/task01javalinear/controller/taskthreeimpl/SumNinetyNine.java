package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class SumNinetyNine {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();


    public void calculations() {

        out.add(as.sumNinetyNine());

    }

    public void consoleOutput() {
        io.output("Sum of all even numbers from 1 to 99  - ", out.getArr(0));
        out.clear();
    }
}
