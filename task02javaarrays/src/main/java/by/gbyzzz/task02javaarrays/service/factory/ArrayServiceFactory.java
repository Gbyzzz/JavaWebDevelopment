package by.gbyzzz.task02javaarrays.service.factory;

import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.impl.arrays.*;

public class ArrayServiceFactory {
    private static final ArrayServiceFactory instance = new ArrayServiceFactory();
    private final ArrayService bubbleSort = new BubbleSort();
    private final ArrayService shakeSort = new ShakeSort();
    private final ArrayService selectSort = new SelectSort();
    private final ArrayService insertSort = new InsertSort();
    private final ArrayService shellSort = new InsertSort();
    private final ArrayService mergeSort = new MergeSort();



    private ArrayServiceFactory(){}
    public static ArrayServiceFactory getInstance(){
        return instance;
    }

    public ArrayService getBubbleSort() {
        return bubbleSort;
    }

    public ArrayService getShakeSort() {
        return shakeSort;
    }

    public ArrayService getSelectSort() {
        return selectSort;
    }

    public ArrayService getInsertSort() {
        return insertSort;
    }

    public ArrayService getShellSort() {
        return shellSort;
    }

    public ArrayService getMergeSort() {
        return mergeSort;
    }

}
