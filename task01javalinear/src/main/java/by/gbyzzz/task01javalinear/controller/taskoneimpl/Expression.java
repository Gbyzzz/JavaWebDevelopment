package by.gbyzzz.task01javalinear.controller.taskoneimpl;

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

public final class Expression implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    private Data in = new Data();
    private Data out = new Data();
    private IOData io = new IOData();
    private IOXML ioxml = new IOXML();
    private ArithmeticService as = new ArithmeticService();
    private FileIO fileIO = new FileIO();

    @Override
    public void exec(final int arg) {
        io.output("z = 2 * x + ( y – 2 ) * 5");
        switch (arg) {
            case 1:
                io.output("Enter x:");
                in.add(io.input());
                LOGGER.info("User entered 'x' - %d", in.get(0));
                io.output("Enter y:");
                in.add(io.input());
                LOGGER.info("User entered 'y' - %d", in.get(1));
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for (int j = 0; j < 2; j++) {
                    in.add(fileIO.readFile("double").get(j));
                }
                break;
            case 3:
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                for (int j = 0; j < 2; j++) {
                in.add(ioxml.readXML("double").get(j));
                }
                break;
            default: break;
        }
        LOGGER.info("Calculating z = 2 * x + ( y – 2 ) * 5 , when x = %d and y = %d", in.get(0), in.get(1));
        out.add(as.expr(in.get(0), in.get(1)));

        io.output("z = ", out.get(0));

        out.clear();

        in.clear();
    }
}
