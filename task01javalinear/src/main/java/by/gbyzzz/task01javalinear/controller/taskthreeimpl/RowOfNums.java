package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class RowOfNums {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();

    public void input(int i){
        io.output("a = 1 / 2^n + 1 / 3^n compare with 'e'");
        switch (i){
            case 1: io.output("Enter e:");
                in.add(io.input());
                io.output("Enter n:");
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
            out.add(as.multiply(in.getArr(0), (int) in.getArr(1)));

    }

    public void consoleOutput() {
            io.output("The sum is ", out.getArr(0));
        out.clear();
        in.clear();
    }
}
