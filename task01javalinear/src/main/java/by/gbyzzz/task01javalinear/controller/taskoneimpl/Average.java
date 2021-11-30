package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Average {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();
    IOXML XMLIn = new IOXML();

    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
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

        out.add(as.average(in.get(0), in.get(1)));

    }

    public void consoleOutput() {
        io.output("The average value of " + in.get(0) + " and " + in.get(1) + ":");
        io.output(out.get(0));
        in.clear();
        out.clear();
    }


}
