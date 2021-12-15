package by.gbyzzz.task02javaarrays.controller.impl.matrix;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.service.MatrixService;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;

public class MultiplicationImpl implements Command {
    @Override
    public void execute() {
        ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();
        MatrixService matrixService = arrayServiceFactory.getMultiplication();
        int [][] arr = {{6,5,1,9,0,4}, {6,5,1,9,0,4}};
        matrixService.execute(arr);
        for(int[] a : arr)
            for (int b : a)
                System.out.print(b);
    }
}