package by.gbyzzz.task05multithreading.controller;

import by.gbyzzz.task05multithreading.controller.command.Command;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserInput implements Command, Runnable {
    private String[] input;
    private FileIOFactory fileIO = FileIOFactory.getInstance();
    private int[] select = {0, 0};
    private static final Logger LOGGER = LogManager.getLogger();



    @Override
    public void execute() {
    }

    @Override
    public void run() {
        LOGGER.trace("Starting" + Thread.currentThread().getName());

        input = fileIO.getFileIO().readFileToStringArray("users_input.txt", (int) Math.random() * 10);
        Controller controller = new Controller();

            select[0] = Integer.parseInt(input[0]);
            if (select[0] == 1) {
                select[1] = Integer.parseInt(input[1]);
            } else if (select[0] == 2){
                select[1] = Integer.parseInt(input[1]);
            } else {
                select[1] = Integer.parseInt(input[1]);
            }
            controller.execute(select);
    }
}
