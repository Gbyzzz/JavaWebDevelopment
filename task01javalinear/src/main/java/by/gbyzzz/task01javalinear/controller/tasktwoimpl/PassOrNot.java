package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GeometryService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class PassOrNot implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    GeometryService gs = new GeometryService();

//    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
//        io.output("Please input info");
//        switch (i){
//            case 1: io.output("Enter first side of the hole:");
//                in.add(io.input(0));
//                io.output("Enter second side of the hole:");
//                in.add(io.input(0));
//                io.output("Enter first side of the brick:");
//                in.add(io.input(0));
//                io.output("Enter second side of the brick:");
//                in.add(io.input(0));
//                io.output("Enter third side of the brick:");
//                in.add(io.input(0));
//                break;
//            case 2:
//                break;
//            case 3: for(int j = 0; j < 5; j++)
//                in.add(XMLIn.readXML("double").get(j));
//                break;
//            default: break;
//        }
//
//    }
//
//    public void calculations() {
//
//        out.add(gs.passOrNot(in.get(0), in.get(1), in.get(2), in.get(3), in.get(4)));
//
//    }
//
//    public void consoleOutput() {
//        if(out.get(0) == 1) {
//        io.output("The brick will pass through the hole.");
//        }else {
//            io.output("The brick will not pass through the hole.");
//        }
//        out.clear();
//        in.clear();
//    }

    @Override
    public void exec(int arg) {
        io.output("Please input info");
        switch (arg){
            case 1: io.output("Enter first side of the hole:");
                in.add(io.input(0));
                io.output("Enter second side of the hole:");
                in.add(io.input(0));
                io.output("Enter first side of the brick:");
                in.add(io.input(0));
                io.output("Enter second side of the brick:");
                in.add(io.input(0));
                io.output("Enter third side of the brick:");
                in.add(io.input(0));
                break;
            case 2:
                break;
            case 3:{
                for(int j = 0; j < 5; j++) {
                    in.add(XMLIn.readXML("double").get(j));
                }
                break;}
            default: break;
        }

        out.add(gs.passOrNot(in.get(0), in.get(1), in.get(2), in.get(3), in.get(4)));

        if(out.get(0) == 1) {
            io.output("The brick will pass through the hole.");
        }else {
            io.output("The brick will not pass through the hole.");
        }
        out.clear();
        in.clear();
    }
}
