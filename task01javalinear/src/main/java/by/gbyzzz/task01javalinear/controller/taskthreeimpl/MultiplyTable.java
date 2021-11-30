package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class MultiplyTable {
    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();

    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
        switch (i){
            case 1:
                io.output("Enter the biggest number, which you want to multiply with 3:");
                in.add(io.input());
                break;
            case 2:
                break;
            case 3: in.add(XMLIn.readXML("double").get(0));
                break;
            default: break;
        }

    }

    public void calculations() {
        for(int i = 1; i<=in.get(0); i++){
            out.add(as.multiply(3, i));
        }
    }

    public void consoleOutput() {
        for(int i = 0; i<in.get(0); i++){
        io.output("3 x " + (i+1) + " = ", out.get(i));
        }
        out.clear();
        in.clear();
    }
}
