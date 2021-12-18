package by.gbyzzz.task02javaarrays.controller.impl.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

public class MultiplicationOnNumImpl implements Command {
    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getMultiplicationOnNum();
        ioData.output("Please insert a number");
        String num = ioData.input().next();
        MyArray a = arrayService.execute("C:\\Java\\MyWorkspace\\task02javaarrays\\src\\main\\resources\\matrix1.txt", num);
        ioData.outputArr(a.getArr());
    }
}