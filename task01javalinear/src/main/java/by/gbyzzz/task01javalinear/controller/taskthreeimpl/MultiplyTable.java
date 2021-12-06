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

public final class MultiplyTable implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    private Data in = new Data();
    private Data out = new Data();
    private IOData io = new IOData();
    private IOXML ioxml = new IOXML();
    private ArithmeticService as = new ArithmeticService();
    private FileIO fileIO = new FileIO();

    @Override
    public void exec(final int arg) {
        switch (arg) {
            case 1:io.output("Enter your number:");
                in.add(io.inputInt());
                io.output("Enter the biggest number, which you want to multiply with your number:");
                in.add(io.inputInt());
                io.output("Enter the lowest number, which you want to multiply with your number:");
                in.add(io.inputInt());
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                    in.add(fileIO.readFile("int").getInt(0));

                break;
            case 3:
                in.add(ioxml.readXML("int").getInt(0));
                break;
            default: break;
        }

    for (int i = in.getInt(2); i <= in.getInt(1); i++) {
        out.add(as.multiply(in.getInt(0), i));
    }
        int j = 0;
    for (int i = in.getInt(2); i <= in.getInt(1); i++) {
        io.output(in.getInt(0) + " x " + i + " = ", out.getInt(j));
        j++;
    }
    out.clear();
    in.clear();
    }
}
