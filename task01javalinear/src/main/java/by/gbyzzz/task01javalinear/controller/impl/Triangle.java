package by.gbyzzz.task01javalinear.controller.impl;

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
        io.output("R: ", gs.triangleDesR(a));
        io.output("r: ", gs.triangleInR(a));
        io.output("S: ", gs.triangleSq(a));
    }
}
