package by.gbyzzz.task02javaarrays.controller.impl.array;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

public class ShakeSortImpl implements Command {

    @Override
    public void execute() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getShakeSort();
        MyArray a = arrayService.execute("C:\\Java\\MyWorkspace\\task02javaarrays\\src\\main\\resources\\array.txt");
        ioData.outputArr(a.getArr());
//        ViewFactory viewFactory = ViewFactory.getInstance();
//        IOData ioData =  viewFactory.getIoData();
//        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
//        ArrayService arrayService = arrayServiceFactory.getShakeSort();
//        int [] arr = {6,5,1,9,0,4};
//        arrayService.sort(arr);
//        ioData.outputArr(arr);
    }
}