package by.gbyzzz.task01javalinear.controller.taskone;

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
            case 3: //in.add(XMLIn);
                break;
            default: break;
        }

    }

    public void triangleCalc(){
        out.add(gs.triangleHeight(in.getArr(0)));
        out.add(gs.triangleDesR(in.getArr(0)));
        out.add(gs.triangleInR(in.getArr(0)));
        out.add(gs.triangleSq(in.getArr(0)));
        in.clear();
    }
    public void consoleOutput() {
        io.output("Results:");
        io.output("Height = ", out.getArr(0));
        io.output("R = ", out.getArr(1));
        io.output("r = ", out.getArr(2));
        io.output("S = ", out.getArr(3));
        out.clear();
    }
}
