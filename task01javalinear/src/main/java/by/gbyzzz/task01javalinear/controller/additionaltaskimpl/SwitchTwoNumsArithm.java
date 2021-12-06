package by.gbyzzz.task01javalinear.controller.additionaltaskimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class get an input from user, makes calculations by calling
 * method from ArithmeticService and shows the result to the user by
 * printing it to the console.
 * @author Anton Pinchuk
 *
 */

public final class SwitchTwoNumsArithm implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    private Data in = new Data();
    private Data out = new Data();
    private IOData io = new IOData();
    private ArithmeticService as = new ArithmeticService();
    private IOXML ioxml = new IOXML();
    private FileIO fileIO = new FileIO();

    @Override
    public void exec(final int arg) {
        io.output("Enter two numbers which you want to switch:");
        switch (arg) {
            case 1: io.output("Enter first number:");
                in.add(io.inputInt());
                LOGGER.info("User entered first number - %d", in.getInt(0));
                io.output("Enter second number:");
                in.add(io.inputInt());
                LOGGER.info("User entered second number - %d", in.getInt(1));
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for (int j = 0; j < 2; j++) {
                    in.add(fileIO.readFile("int").getInt(j));
                }
                break;
            case 3:
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                for (int j = 0; j < 2; j++) {
                    in.add(ioxml.readXML("int").getInt(j));
                }
                break;
            default: break;

        }
        LOGGER.info("switching positions of %d and %d", in.getInt(0), in.getInt(1));
        out = (as.switchTwoNumsArithm(in.getInt(0), in.getInt(1)));
        io.output("Your input a =  %d and b = %d", in.getInt(0), in.getInt(1));
        io.output("Now a =  %d and b = %d", out.getInt(0), out.getInt(1));
        in.clear();
        out.clear();
    }
}
