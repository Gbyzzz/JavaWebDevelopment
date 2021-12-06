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

public final class Boat implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    private Data in = new Data();
    private Data out = new Data();
    private IOData io = new IOData();
    private IOXML ioxml = new IOXML();
    private ArithmeticService as = new ArithmeticService();
    private FileIO fileIO = new FileIO();

    @Override
    public void exec(final int arg) {
        io.output("Please enter speed and time:");
        switch (arg) {
            case 1: io.output("Enter speed of the boat in still water: ");
                in.add(io.input());
                LOGGER.info("User entered speed of boat - %d", in.get(0));
                io.output("Enter speed of river's flow: ");
                in.add(io.input());
                LOGGER.info("User entered speed of river's flow - %d", in.get(1));
                io.output("Enter first time: ");
                in.add(io.input());
                LOGGER.info("Enter first time - %d", in.get(2));
                io.output("Enter second time: ");
                in.add(io.input());
                LOGGER.info("Enter second time - %d", in.get(3));
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for (int j = 0; j < 4; j++) {
                    in.add(fileIO.readFile("double").get(j));
                }
                break;
            case 3:
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                for (int j = 0; j < 4; j++) {
                in.add(ioxml.readXML("double").get(j));
            }
                break;
            default: break;
        }
        LOGGER.info("Calculating total distance with boat method");
        out.add(as.boat(in.get(0), in.get(1), in.get(2), in.get(3)));

        io.output("Total distance is ", out.get(0));

        out.clear();

        in.clear();
    }
}
