package by.gbyzzz.task01javalinear.controller.taskoneimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Boat implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();
    FileIO fileIO = new FileIO();

    @Override
    public void exec(int arg) {
        io.output("Please enter speed and time:");
        switch (arg){
            case 1: io.output("Enter speed of the boat in still water: ");
                in.add(io.input());
                LOGGER.info("User entered speed of boat - " + in.get(0));
                io.output("Enter speed of river's flow: ");
                in.add(io.input());
                LOGGER.info("User entered speed of river's flow - " + in.get(1));
                io.output("Enter first time: ");
                in.add(io.input());
                LOGGER.info("Enter first time - " + in.get(2));
                io.output("Enter second time: ");
                in.add(io.input());
                LOGGER.info("Enter second time - " + in.get(3));
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for(int j = 0; j < 4; j++) {
                    in.add(fileIO.readFile("double").get(j));
                }
                break;
            case 3:{
                LOGGER.info("Parsing XML file with XMLIn class and writing info to array");
                for(int j = 0; j < 4; j++) {
                in.add(XMLIn.readXML("double").get(j));
            }
                break;}
            default: break;
        }
        LOGGER.info("Calculating total distance with boat method");
        out.add(as.boat(in.get(0), in.get(1), in.get(2), in.get(3)));

        io.output("Total distance is ", out.get(0));

        out.clear();

        in.clear();
    }
}
