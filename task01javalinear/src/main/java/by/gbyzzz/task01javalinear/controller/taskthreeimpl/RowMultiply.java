package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

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

public final class RowMultiply implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    private Data in = new Data();
    private Data out = new Data();
    private IOData io = new IOData();
    private IOXML ioxml = new IOXML();
    private ArithmeticService as = new ArithmeticService();
    private FileIO fileIO = new FileIO();

    @Override
    public void exec(final int arg) {
        io.output("Result of a(a+1)...(a+n-1)");
        switch (arg) {
            case 1:
                io.output("Enter a:");
                in.add(io.input());
                io.output("Enter n:");
                in.add(io.input());
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for (int j = 0; j < 2; j++) {
                    in.add(fileIO.readFile("double").get(j));
                }
                break;
            case 3:
                for (int j = 0; j < 2; j++) {
                    in.add(ioxml.readXML("double").get(j));
                }
                break;
            default: break;
        }



        out.add(as.rowMultiply(in.get(0), (int) in.get(1)));


        io.output("Result is - ", out.get(0));
        out.clear();
        in.clear();
    }
}
