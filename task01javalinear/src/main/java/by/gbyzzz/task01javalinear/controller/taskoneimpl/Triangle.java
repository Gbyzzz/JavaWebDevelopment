package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GeometryService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Triangle implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    GeometryService gs = new GeometryService();
    IOXML XMLIn = new IOXML();
    FileIO fileIO = new FileIO();

    @Override
    public void exec(int arg) {
        io.output("Enter the side of the equilateral triangle:");
        switch (arg){
            case 1: in.add(io.input());
                LOGGER.info("User entered side of the equilateral triangle - " + in.get(0));
                break;
            case 2: LOGGER.info("Reading txt file for input data");
                    in.add(fileIO.readFile("double").get(0));

                break;
            case 3:{
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                in.add(XMLIn.readXML("double").get(0));
                break;}
            default: break;
        }
        LOGGER.info("Calculating height of the equilateral triangle, with side = " + in.get(0));
        out.add(gs.triangleHeight(in.get(0)));
        LOGGER.info("Calculating described circle of the equilateral triangle, with side = " + in.get(0));
        out.add(gs.triangleDesR(in.get(0)));
        LOGGER.info("Calculating inscribed circle of the equilateral triangle, with side = " + in.get(0));
        out.add(gs.triangleInR(in.get(0)));
        LOGGER.info("Calculating square of the equilateral triangle, with side = " + in.get(0));
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