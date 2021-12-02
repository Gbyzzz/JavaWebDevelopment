package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Expression implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();
    FileIO fileIO = new FileIO();

//    public void input(int i) throws ParserConfigurationException, IOException, SAXException {
//        io.output("z = 2 * x + ( y – 2 ) * 5");
//        switch (i){
//            case 1: io.output("Enter x:");
//                in.add(io.input());
//                io.output("Enter y:");
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
//        out.add(as.expr(in.get(0), in.get(1)));
//
//    }
//
//    public void consoleOutput() {
//
//        io.output("z = ", out.get(0));
//        out.clear();
//        in.clear();
//    }

    @Override
    public void exec(int arg) {
        io.output("z = 2 * x + ( y – 2 ) * 5");
        switch (arg){
            case 1: io.output("Enter x:");
                in.add(io.input());
                LOGGER.info("User entered 'x' - " + in.get(0));
                io.output("Enter y:");
                in.add(io.input());
                LOGGER.info("User entered 'y' - " + in.get(1));
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for(int j = 0; j < 2; j++) {
                    in.add(fileIO.readFile("double").get(j));
                }
                break;
            case 3:{
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                for(int j = 0; j < 2; j++) {
                in.add(XMLIn.readXML("double").get(j));
                }
                break;}
            default: break;
        }
        LOGGER.info("Calculating z = 2 * x + ( y – 2 ) * 5 , when x = " + in.get(0) + "and y = " + in.get(1));
        out.add(as.expr(in.get(0), in.get(1)));

        io.output("z = ", out.get(0));

        out.clear();

        in.clear();
    }
}
