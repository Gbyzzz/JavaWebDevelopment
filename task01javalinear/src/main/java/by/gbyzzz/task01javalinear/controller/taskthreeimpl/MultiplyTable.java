package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class MultiplyTable {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();

    public void input(int i){
        switch (i){
            case 1: io.output("Enter the number which you want to multiply:");
                in.add(io.input());
                io.output("Enter the biggest number, which you want to multiply with your number:");
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
        for(int i = 1; i<=in.get(1); i++){
            out.add(as.multiply(in.get(0), i));
        }
    }

    public void consoleOutput() {
        for(int i = 0; i<in.get(1); i++){
        io.output(in.get(0) + "x" + in.get(1) + " = ", out.get(0));
        }
        out.clear();
        in.clear();
    }
}
