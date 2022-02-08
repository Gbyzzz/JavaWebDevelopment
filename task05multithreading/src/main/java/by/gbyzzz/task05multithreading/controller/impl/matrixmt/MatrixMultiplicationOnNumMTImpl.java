package by.gbyzzz.task05multithreading.controller.impl.matrixmt;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.controller.command.Command;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.factory.ArrayServiceFactory;
import by.gbyzzz.task05multithreading.view.IOData;
import by.gbyzzz.task05multithreading.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixMultiplicationOnNumMTImpl implements Command {
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getMultiplicationOnNumMT();
        int threadNum = Runtime.getRuntime().availableProcessors();
        if (threadNum > 4){
            threadNum--;
        }
        LOGGER.trace("Executing multiplication of matrix and a num in multithreading mode");
        MyArray a = arrayService.execute("matrix1.txt", "5", String.valueOf(threadNum));
        ioData.outputArr(a.getArr());
    }
}