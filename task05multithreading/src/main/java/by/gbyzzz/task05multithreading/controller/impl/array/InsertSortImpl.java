package by.gbyzzz.task05multithreading.controller.impl.array;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.controller.command.Command;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.factory.ArrayServiceFactory;
import by.gbyzzz.task05multithreading.view.IOData;
import by.gbyzzz.task05multithreading.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertSortImpl implements Command {
        private static final Logger LOGGER = LogManager.getLogger();

        @Override
        public void execute() {
                ViewFactory viewFactory = ViewFactory.getInstance();
                IOData ioData =  viewFactory.getIoData();
                ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
                ArrayService arrayService = arrayServiceFactory.getInsertSort();
                LOGGER.trace("Executing insert sort");
                MyArray a = arrayService.execute("array.txt");
                ioData.outputArr(a.getArr());

        }
}
