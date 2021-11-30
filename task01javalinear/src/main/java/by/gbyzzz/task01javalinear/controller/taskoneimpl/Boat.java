package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Boat {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();

    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
        io.output("Please enter speed and time:");
        switch (i){
            case 1: io.output("Enter speed of the boat in still water: ");
                in.add(io.input());
                io.output("Enter speed of river's flow: ");
                in.add(io.input());
                io.output("Enter first time: ");
                in.add(io.input());
                io.output("Enter second time: ");
                in.add(io.input());
                break;
            case 2:
                break;
            case 3: for(int j = 0; j < 4; j++)
                in.add(XMLIn.readXML("double").get(j));
                break;
            default: break;
        }

    }

    public void calculations() {

        out.add(as.boat(in.get(0), in.get(1), in.get(2), in.get(3)));

    }

    public void consoleOutput() {

        io.output("Total distance is ", out.get(0));
        out.clear();
        in.clear();

    }
}
