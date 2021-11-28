package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GeometryService;
import by.gbyzzz.task01javalinear.view.IOData;

public class PassOrNot {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    GeometryService gs = new GeometryService();

    public void input(int i){
        io.output("Please input info");
        switch (i){
            case 1: io.output("Enter first side of the hole:");
                in.add(io.input());
                io.output("Enter second side of the hole:");
                in.add(io.input());
                io.output("Enter first side of the brick:");
                in.add(io.input());
                io.output("Enter second side of the brick:");
                in.add(io.input());
                io.output("Enter third side of the brick:");
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

        out.add(gs.passOrNot(in.get(0), in.get(1), in.get(2), in.get(3), in.get(4)));

    }

    public void consoleOutput() {
        if(out.get(0) == 1) {
        io.output("The brick will pass through the hole.");
        }else {
            io.output("The brick will not pass through the hole.");
        }
        out.clear();
        in.clear();
    }
}
