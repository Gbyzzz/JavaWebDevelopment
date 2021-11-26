package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class PositiveNumCount {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();

    public void input(int i){
        io.output("Please input three numbers");
        switch (i){
            case 1: io.output("Enter first number:");
                in.add(io.input());
                io.output("Enter second number:");
                in.add(io.input());
                io.output("Enter third number:");
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

        out.add(as.positiveNumCount(in.getArr(0), in.getArr(1), in.getArr(2)));

    }

    public void consoleOutput() {
        io.output("Quantity of positive numbers: ", out.getArr(0));
        out.clear();
        in.clear();
    }
}
