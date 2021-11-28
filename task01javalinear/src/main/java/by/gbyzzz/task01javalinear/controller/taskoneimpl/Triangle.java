package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.dal.FileReader;
import by.gbyzzz.task01javalinear.dal.XMLReader;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GeometryService;
import by.gbyzzz.task01javalinear.view.IOData;

public class Triangle {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    GeometryService gs = new GeometryService();
    XMLReader XMLIn = new XMLReader();
    FileReader FileIn = new FileReader();

    public void input(int i){
        io.output("Enter the side of the triangle:");
        switch (i){
            case 1: in.add(io.input());
                break;
            case 2:
                break;
            case 3: //XMLIn.XMLReader();
                break;
            default: break;
        }

    }

    public void calculations (){
        out.add(gs.triangleHeight(in.get(0)));
        out.add(gs.triangleDesR(in.get(0)));
        out.add(gs.triangleInR(in.get(0)));
        out.add(gs.triangleSq(in.get(0)));
        in.clear();
    }
    public void consoleOutput() {
        io.output("Results:");
        io.output("Height = ", out.get(0));
        io.output("R = ", out.get(1));
        io.output("r = ", out.get(2));
        io.output("S = ", out.get(3));
        out.clear();
    }
}
