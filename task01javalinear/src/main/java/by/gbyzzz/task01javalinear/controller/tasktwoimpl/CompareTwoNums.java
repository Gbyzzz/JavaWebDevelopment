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

public class CompareTwoNums implements Command {

    private static final Logger LOGGER = LogManager.getLogger();


    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();

//    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
//        io.output("Please input two numbers to compare");
//        switch (i){
//            case 1: io.output("Enter first number:");
//                in.add(io.input());
//                io.output("Enter second number:");
//                in.add(io.input());
//                break;
//            case 2:
//                break;
//            case 3: for(int j = 0; j < 2; j++)
//                in.add(XMLIn.readXML("double").get(j));
//                break;
//            default: break;
//        }
//
//    }
//
//    public void calculations() {
//
//        out.add(as.compareTwoNums(in.get(0), in.get(1)));
//
//    }
//
//    public void consoleOutput() {
//        io.output("Minimum number is - ", out.get(0));
//        out.clear();
//        in.clear();
//    }

    @Override
    public void exec(int arg) {
        io.output("Please input two numbers to compare");
        switch (arg){
            case 1: io.output("Enter first number:");
                in.add(io.input());
                io.output("Enter second number:");
                in.add(io.input());
                break;
            case 2:
                break;
            case 3:{
                for(int j = 0; j < 2; j++) {
                    in.add(XMLIn.readXML("double").get(j));
                }
                break;}
            default: break;
        }


        out.add(as.compareTwoNums(in.get(0), in.get(1)));


        io.output("Minimum number is - ", out.get(0));
        out.clear();
        in.clear();
    }
}
