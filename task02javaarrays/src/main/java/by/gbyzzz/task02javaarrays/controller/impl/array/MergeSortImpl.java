package by.gbyzzz.task02javaarrays.controller.impl.array;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;

public class MergeSortImpl implements Command {
    @Override
    public void execute() {
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        ArrayService arrayService = arrayServiceFactory.getMergeSort();
        int [] arr = {6,5,1,9,0,4};
        arrayService.sort(arr);
        for(int a : arr)
            System.out.println(a);
    }
}
