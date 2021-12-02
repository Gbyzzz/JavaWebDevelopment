package by.gbyzzz.task01javalinear.controller.tasktwoimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CompareWithThree implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    static Data in = new Data();
    static Data out = new Data();
    IOData io = new IOData();
    IOXML XMLIn = new IOXML();
    ArithmeticService as = new ArithmeticService();
    FileIO fileIO = new FileIO();

    @Override
    public void exec(int arg) {
        switch (arg){
            case 1: io.output("Enter your number:");
                in.add(io.inputInt());
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");

                    in.add(fileIO.readFile("int").getInt(0));

                break;
            case 3:
                in.add(XMLIn.readXML("int").getInt(0));
                break;
            default: break;
        }

        out.add(as.compareWithThree(in.getInt(0)));


        if(out.get(0) == 1) {
            io.output("Yes!Your number is less than '3'.");
        }else if(out.get(0) == 0) {
            io.output("No... Your number is bigger than '3'.");
        }else {
            io.output("Your number is =3.");
        }

        out.clear();
        in.clear();
    }
}
