package by.gbyzzz.task02javaarrays.controller.impl.array;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

public class InsertAddrSortImpl implements Command {
    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData = viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getInsertAddrSort();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray a = arrayService.execute("array.txt");
        ioData.outputArr(a.getArr());
    }
}