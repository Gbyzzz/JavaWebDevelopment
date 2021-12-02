package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CompareTwoNums implements Command {

    private static final Logger LOGGER = LogManager.getLogger();


    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();
    FileIO fileIO = new FileIO();

    @Override
    public void exec(int arg) {
        io.output("Please input two numbers to compare");
        switch (arg){
            case 1: io.output("Enter first number:");
                in.add(io.input());
                io.output("Enter second number:");
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


        out.add(as.compareTwoNums(in.get(0), in.get(1)));


        io.output("Minimum number is - ", out.get(0));
        out.clear();
        in.clear();
    }
}
