package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

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

public class SumMinMax implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();

//    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
//        io.output("Enter min and max number:");
//        switch (i) {
//            case 1:
//                io.output("Enter min:");
//                in.add(io.input("odd", 1, 99));
//                io.output("Enter max:");
//                in.add(io.input("odd", 1, 99));
//                break;
//            case 2:
//                break;
//            case 3:
//                for (int j = 0; j < 2; j++)
//                    in.add(XMLIn.readXML("int").getInt(j));
//                break;
//            default:
//                break;
//        }
//    }
//        public void calculations() {
//            out.add(as.sumMaxMin(in.getInt(0), in.getInt(1)));
//        }
//
//    public void consoleOutput() {
//        io.output("Sum of all odd numbers from " + in.getInt(0) + " to " + in.getInt(1) + " - ", out.getInt(0));
//        in.clear();
//        out.clear();
//    }

    @Override
    public void exec(int arg) {
        io.output("Enter min and max number:");
        switch (arg) {
            case 1:
                io.output("Enter min:");
                in.add(io.input("odd", 1, 99));
                io.output("Enter max:");
                in.add(io.input("odd", 1, 99));
                break;
            case 2:
                break;
            case 3:{
                for (int j = 0; j < 2; j++) {
                    in.add(XMLIn.readXML("int").getInt(j));
                }
                break;}
            default:
                break;
        }

        out.add(as.sumMaxMin(in.getInt(0), in.getInt(1)));

        io.output("Sum of all odd numbers from " + in.getInt(0) + " to " + in.getInt(1) + " - ", out.getInt(0));
        in.clear();
        out.clear();
    }
}


