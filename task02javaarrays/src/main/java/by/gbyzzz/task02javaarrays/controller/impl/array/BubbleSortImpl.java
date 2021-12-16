package by.gbyzzz.task02javaarrays.controller.impl.array;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

public class BubbleSortImpl implements Command {
    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getBubbleSort();
        Array a = ArrayService.readFileToArray("C:\\Java\\MyWorkspace\\task02javaarrays\\src\\main\\resources\\array.txt");
        arrayService.sort(a.getArr());
        ioData.outputArr(a.getArr());
    }
}
