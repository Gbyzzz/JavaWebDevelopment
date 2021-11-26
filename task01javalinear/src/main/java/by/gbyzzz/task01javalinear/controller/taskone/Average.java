package by.gbyzzz.task01javalinear.controller.taskone;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class Average {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();

    public void input(int i){
        switch (i){
            case 1: io.output("Enter first number:");
                in.add(io.input());
                io.output("Enter second number:");
                in.add(io.input());
                break;
            case 2:
                break;
            case 3: //in.add(XMLIn);
                break;
            default: break;
        }

    }

    public void calculations() {

        out.add(as.average(in.getArr(0), in.getArr(1)));

    }

    public void consoleOutput() {
        io.output("The average value of " + in.getArr(0) + " and " + in.getArr(1) + ":");
        io.output(out.getArr(0));
        in.clear();
        out.clear();
    }


}
