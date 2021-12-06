package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GeometryService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class get an input from user, makes calculations by calling
 * method from GeometryService and shows the result to the user by
 * printing it to the console.
 * @author Anton Pinchuk
 *
 */

public final class Triangle implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    private Data in = new Data();
    private Data out = new Data();
    private IOData io = new IOData();
    private GeometryService gs = new GeometryService();
    private IOXML ioxml = new IOXML();
    private FileIO fileIO = new FileIO();

    @Override
    public void exec(final int arg) {
        io.output("Enter the side of the equilateral triangle:");
        switch (arg) {
            case 1: in.add(io.input());
                LOGGER.info("User entered side of the equilateral triangle - %d", in.get(0));
                break;
            case 2: LOGGER.info("Reading txt file for input data");
                    in.add(fileIO.readFile("double").get(0));

                break;
            case 3:
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                in.add(ioxml.readXML("double").get(0));
                break;
            default: break;
        }
        LOGGER.info("Calculating height of the equilateral triangle, with side = %d", in.get(0));
        out.add(gs.triangleHeight(in.get(0)));
        LOGGER.info("Calculating described circle of the equilateral triangle, with side = %d", in.get(0));
        out.add(gs.triangleDesR(in.get(0)));
        LOGGER.info("Calculating inscribed circle of the equilateral triangle, with side = %d", in.get(0));
        out.add(gs.triangleInR(in.get(0)));
        LOGGER.info("Calculating square of the equilateral triangle, with side = %d", in.get(0));
        out.add(gs.triangleSq(in.get(0)));
        in.clear();

        io.output("Results:");
        io.output("Height = ", out.get(0));
        io.output("R = ", out.get(1));
        io.output("r = ", out.get(2));
        io.output("S = ", out.get(3));
        out.clear();
    }
}