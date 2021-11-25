package by.gbyzzz.task01javalinear.entity;

import by.gbyzzz.task01javalinear.service.GeometryService;
import by.gbyzzz.task01javalinear.view.IOData;

public class Triangle {
    double a;
    IOData io = new IOData();
    GeometryService gs = new GeometryService();

    public void  hrrs(){
        io.output("Enter the side of the triangle:");
        a = io.input();
        io.output("Height: ", gs.triangleHeight(a));
        io.output("R: ", gs.triangleSr(a));
        io.output("r: ", gs.triangleCr(a));
        io.output("S: ", gs.triangleSq(a));
    }
}
