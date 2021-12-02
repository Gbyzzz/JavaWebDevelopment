package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class PositiveNumCount implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();

//    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
//        io.output("Please input three numbers");
//        switch (i){
//            case 1: io.output("Enter first number:");
//                in.add(io.input());
//                io.output("Enter second number:");
//                in.add(io.input());
//                io.output("Enter third number:");
//                in.add(io.input());
//                break;
//            case 2:
//                break;
//            case 3: for(int j = 0; j < 3; j++)
//                in.add(XMLIn.readXML("double").get(j));
//                break;
//            default: break;
//        }
//
//    }
//
//    public void calculations() {
//
//        out.add(as.positiveNumCount(in.get(0), in.get(1), in.get(2)));
//
//    }
//
//    public void consoleOutput() {
//        io.output("Quantity of positive numbers: ", out.get(0));
//        out.clear();
//        in.clear();
//    }

    @Override
    public void exec(int arg) {
        io.output("Please input three numbers");
        switch (arg){
            case 1: io.output("Enter first number:");
                in.add(io.input());
                io.output("Enter second number:");
                in.add(io.input());
                io.output("Enter third number:");
                in.add(io.input());
                break;
            case 2:
                break;
            case 3: {for(int j = 0; j < 3; j++) {
                in.add(XMLIn.readXML("double").get(j));
            }
                break;}
            default: break;
        }

        out.add(as.positiveNumCount(in.get(0), in.get(1), in.get(2)));

        io.output("Quantity of positive numbers: ", out.get(0));
        out.clear();
        in.clear();
    }
}
