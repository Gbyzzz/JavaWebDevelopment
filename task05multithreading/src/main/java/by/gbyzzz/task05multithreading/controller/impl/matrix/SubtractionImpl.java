package by.gbyzzz.task05multithreading.controller.impl.matrix;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.controller.command.Command;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.factory.ArrayServiceFactory;
import by.gbyzzz.task05multithreading.view.IOData;
import by.gbyzzz.task05multithreading.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SubtractionImpl implements Command {
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getSubtraction();
        LOGGER.trace("Executing subtraction of two matrices");
        MyArray a = arrayService.execute("matrix1.txt", "matrix2.txt");
        ioData.outputArr(a.getArr());
    }
}