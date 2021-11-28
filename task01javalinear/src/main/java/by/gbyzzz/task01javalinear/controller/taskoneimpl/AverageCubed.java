package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class AverageCubed {
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

        out.add(as.average3(in.get(0), in.get(1)));

    }

    public void consoleOutput() {
        io.output("The average value of cubed values of " + in.get(0) + " and " + in.get(1) + ":");
        io.output(out.get(0));
        in.clear();
        out.clear();
    }
}
