package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class TaskWithTwoNums {

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();

    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
        io.output("Please input two numbers");
        switch (i){
            case 1: io.output("Enter first number:");
                in.add(io.input());
                io.output("Enter second number:");
                in.add(io.input());
                break;
            case 2:
                break;
            case 3: for(int j = 0; j < 2; j++)
                in.add(XMLIn.readXML("double").get(j));
                break;
            default: break;
        }

    }

    public void calculations() {

        out.add(as.taskWithTwoNums(in.get(0), in.get(1)));

    }

    public void consoleOutput() {
        io.output("Both numbers equals ", out.get(0));
        out.clear();
        in.clear();
    }
}
