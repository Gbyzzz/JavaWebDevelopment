package by.gbyzzz.task02javaarrays.controller.impl.array;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSortImpl implements Command {
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getBubbleSort();
        LOGGER.trace("Executing bubble sort");
        MyArray a = arrayService.execute("array.txt");
        ioData.outputArr(a.getArr());
    }
}
