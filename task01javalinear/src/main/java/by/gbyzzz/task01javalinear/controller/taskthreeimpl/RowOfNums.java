package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class RowOfNums {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();

    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
        io.output("a = 1 / 2^n + 1 / 3^n compare with 'e'");
        switch (i){
            case 1: io.output("Enter e:");
                in.add(io.input());
                io.output("Enter n:");
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
            out.add(as.rowOfNums(in.get(0), (int) in.get(1)));

    }

    public void consoleOutput() {
        io.output("The sum is ", out.get(0));
        out.clear();
        in.clear();
    }
}
