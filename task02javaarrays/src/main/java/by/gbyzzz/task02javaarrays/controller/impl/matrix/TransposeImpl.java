package by.gbyzzz.task02javaarrays.controller.impl.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TransposeImpl implements Command {
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getTranspose();
        LOGGER.trace("Executing transpose of matrix");
        MyArray a = arrayService.execute("matrix1.txt");
        ioData.outputArr(a.getArr());
    }
}