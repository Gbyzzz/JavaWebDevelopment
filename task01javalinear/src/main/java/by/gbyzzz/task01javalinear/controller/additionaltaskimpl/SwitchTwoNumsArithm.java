package by.gbyzzz.task01javalinear.controller.additionaltaskimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SwitchTwoNumsArithm implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    ArithmeticService as = new ArithmeticService();
    IOXML XMLIn = new IOXML();
    FileIO fileIO = new FileIO();

    @Override
    public void exec(int arg) {
        io.output("Enter two numbers which you want to switch:");
        switch (arg){
            case 1: io.output("Enter first number:");
                in.add(io.input());
                LOGGER.info("User entered first number - " + in.get(0));
                io.output("Enter second number:");
                in.add(io.input());
                LOGGER.info("User entered second number - " + in.get(1));
                break;
            case 2: LOGGER.info("Reading txt file for input data");
                for(int j = 0; j < 2; j++) {
                    in.add(fileIO.readFile("int").get(j));
                }
                break;
            case 3:
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                for(int j = 0; j < 2; j++) {
                    in.add(XMLIn.readXML("int").get(j));
                }
                break;
            default: break;

        }
        LOGGER.info("switching positions of " + in.get(0) + " and " + in.get(1));
        out = (as.switchTwoNumsArithm(in.get(0), in.get(1)));
        io.output("Your input a =  " + in.get(0) + " and b = " + in.get(1));
        io.output("Now a =  " + out.get(0) + " and b = " + out.get(1));
        in.clear();
        out.clear();
    }
}
