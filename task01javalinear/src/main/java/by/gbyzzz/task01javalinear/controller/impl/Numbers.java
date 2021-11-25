package by.gbyzzz.task01javalinear.controller.impl;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;

public final class Numbers {
    private double a;
    private double b;
    private double c;
    private double d;
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();

    public void avrage() {
        io.output("Enter first number:");
        a = io.input();
        io.output("Enter second number:");
        b = io.input();
        io.output("The average value of " + a + " and " + b + ":");
        io.output(as.average(a, b));
    }

    public void avrage3() {
        io.output("Enter first number:");
        a = io.input();
        io.output("Enter second number:");
        b = io.input();
        io.output("The average value of cubed " + a + " and " + b + ":");
        io.output(as.average3(a, b));
    }

    public void expression() {
        io.output("z = 2 * x + ( y – 2 ) * 5");
        io.output("Enter x:");
        a = io.input();
        io.output("Enter y:");
        b = io.input();
        io.output("z = ", as.expr(a, b));
    }
    public void boat() {
        io.output("Enter speed in still water: ");
        a = io.input();
        io.output("Enter speed of river's flow: ");
        b = io.input();
        io.output("Enter first time: ");
        c = io.input();
        io.output("Enter second time: ");
        d = io.input();
        io.output("Total distance is ", as.boat(a, b, c, d));
    }

}
