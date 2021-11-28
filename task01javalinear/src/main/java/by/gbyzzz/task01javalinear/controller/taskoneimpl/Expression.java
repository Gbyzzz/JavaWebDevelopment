package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class Expression {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();

    public void input(int i){
        io.output("z = 2 * x + ( y – 2 ) * 5");
        switch (i){
            case 1: io.output("Enter x:");
                in.add(io.input());
                io.output("Enter y:");
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

        out.add(as.expr(in.get(0), in.get(1)));

    }

    public void consoleOutput() {

        io.output("z = ", out.get(0));
        out.clear();
        in.clear();
    }
}
