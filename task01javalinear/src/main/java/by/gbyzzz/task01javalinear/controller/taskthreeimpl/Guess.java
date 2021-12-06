package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.dal.FileIO;
import by.gbyzzz.task01javalinear.dal.IOXML;
import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GuessService;
import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class get an input from user and checks if the user
 * guessed right or not and outputs the result.
 * @author Anton Pinchuk
 *
 */

public final class Guess implements Command {

    private static final Logger LOGGER = LogManager.getLogger();

    private Data in = new Data();
    private Data rand = new Data();
    private Data rightGuess = new Data();
    private Data wrongGuess = new Data();
    private Data notGuessed = new Data();
    private IOData io = new IOData();
    private GuessService gs = new GuessService();
    private IOXML ioxml = new IOXML();
    private FileIO fileIO = new FileIO();

    @Override
    public void exec(final int arg) {
        switch (arg) {
            case 1: io.output("Enter your first guess:");
                in.add(io.input("range", 1, 15));
                io.output("Enter your second guess:");
                in.add(io.input("range", 1, 15));
                io.output("Enter your third guess:");
                in.add(io.input("range", 1, 15));
                io.output("Enter your forth guess:");
                in.add(io.input("range", 1, 15));
                io.output("Enter your fifth guess:");
                in.add(io.input("range", 1, 15));
                break;
            case 2:
                LOGGER.info("Reading txt file for input data");
                for (int j = 0; j < 5; j++) {
                    in.add(fileIO.readFile("int").getInt(j));
                }
                break;
            case 3:
                for (int j = 0; j < 5; j++) {
                    in.add(ioxml.readXML("int").getInt(j));
                }
                    break;
            default: break;
        }

        for (int i = 0; i < 5; i++) {
            rand.add(gs.random(15));
        }

        for (int i = 0; i < 5; i++) {
            if (gs.rightGuess(in.getInt(i), rand) == 1) {
                rightGuess.add(in.getInt(i));
            } else {
                wrongGuess.add(in.getInt(i));
            }
        }

        for (int i = 0; i < 5; i++) {
            if (gs.notGuessed(rand.getInt(i), in) == 1) {
                notGuessed.add(rand.getInt(i));
            }
        }

        io.output("Guessed numbers: ");
        for (int i = 0; i < rand.size(); i++) {
            io.output(rand.getInt(i));
        }

        io.output("Right guesses: ");
        for (int i = 0; i < rightGuess.size(); i++) {
            io.output(rightGuess.getInt(i));
        }

        io.output("Wrong guesses: ");
        for (int i = 0; i < wrongGuess.size(); i++) {
            io.output(wrongGuess.getInt(i));
        }

        io.output("Not guessed: ");
        for (int i = 0; i < notGuessed.size(); i++) {
            io.output(notGuessed.getInt(i));
        }

        rand.clear();
        rightGuess.clear();
        wrongGuess.clear();
        notGuessed.clear();
        in.clear();
    }
}
