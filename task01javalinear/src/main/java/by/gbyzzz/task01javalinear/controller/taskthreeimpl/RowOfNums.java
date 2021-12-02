package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RowOfNums implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();
    FileIO fileIO = new FileIO();

    @Override
    public void exec(int arg) {
        io.output("a = 1 / 2^n + 1 / 3^n compare with 'e'");
        switch (arg){
            case 1: io.output("Enter e:");
                in.add(io.input());
                io.output("Enter n:");
                in.add(io.input());
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for(int j = 0; j < 2; j++) {
                    in.add(fileIO.readFile("double").get(j));
                }
                break;
            case 3:{
                for(int j = 0; j < 2; j++) {
                    in.add(XMLIn.readXML("double").get(j));
                }
                break;}
            default: break;
        }


        out.add(as.rowOfNums(in.get(0), (int) in.get(1)));


        io.output("The sum is ", out.get(0));
        out.clear();
        in.clear();
    }
}
