package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public class CompareWithThree {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();

    public void input(int i){
        switch (i){
            case 1: io.output("Enter your number:");
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

        out.add(as.compareWithThree(in.getArr(0)));

    }

    public void consoleOutput() {
        if(out.getArr(0) == 1) {
            io.output("Your number is less than '3'.");
        }else {
            io.output("Your number is bigger than '3'.");
        }
        out.clear();
        in.clear();
    }

}
