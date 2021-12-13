package by.gbyzzz.task02javaarrays.controller.impl;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;

public class InsertSortImpl implements Command {

        @Override
        public void execute() {
            ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
            ArrayService arrayService = arrayServiceFactory.getBubbleSort();
            int [] arr = {6,5,1,9,0,4};
            arrayService.sort(arr);
            for(int a : arr)
                System.out.println(a);
        }
}

