package by.gbyzzz.task05multithreading.service.factory;

import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.impl.arrays.*;
import by.gbyzzz.task05multithreading.service.impl.matrix.*;
import by.gbyzzz.task05multithreading.service.impl.matrixmultithreading.AdditionMT;
import by.gbyzzz.task05multithreading.service.impl.matrixmultithreading.MultiplicationOnNumMT;
import by.gbyzzz.task05multithreading.service.impl.matrixmultithreading.SubtractionMT;

public final class ArrayServiceFactory {
    private static final ArrayServiceFactory INSTANCE = new ArrayServiceFactory();
    private final ArrayService bubbleSort = new BubbleSort();
    private final ArrayService shakeSort = new ShakeSort();
    private final ArrayService selectSort = new SelectSort();
    private final ArrayService insertSort = new InsertSort();
    private final ArrayService shellSort = new ShellSort();
    private final ArrayService mergeSort = new MergeSort();
    private final ArrayService insertAddrSort = new InsertAddrSort();
    private final ArrayService externalSort = new ExternalSort();
    private final ArrayService addition = new Addition();
    private final ArrayService exponentiation = new Exponentiation();
    private final ArrayService multiplication = new Multiplication();
    private final ArrayService multiplicationOnNum = new MultiplicationOnNum();
    private final ArrayService subtraction = new Subtraction();
    private final ArrayService transpose = new Transpose();
    private final ArrayService additionMT = new AdditionMT();
    private final ArrayService multiplicationOnNumMT = new MultiplicationOnNumMT();
    private final ArrayService subtractionMT = new SubtractionMT();



    private ArrayServiceFactory() { }
    public static ArrayServiceFactory getInstance() {
        return INSTANCE;
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

    public ArrayService getInsertAddrSort() {
        return insertAddrSort;
    }

    public ArrayService getExternalSort() {
        return externalSort;
    }

    public ArrayService getShellSort() {
        return shellSort;
    }

    public ArrayService getMergeSort() {
        return mergeSort;
    }

    public ArrayService getAddition() {
        return addition;
    }

    public ArrayService getExponentiation() {
        return exponentiation;
    }

    public ArrayService getMultiplication() {
        return multiplication;
    }

    public ArrayService getMultiplicationOnNum() {
        return multiplicationOnNum;
    }

    public ArrayService getSubtraction() {
        return subtraction;
    }

    public ArrayService getTranspose() {
        return transpose;
    }

    public ArrayService getAdditionMT() {
        return additionMT;
    }

    public ArrayService getMultiplicationOnNumMT() {
        return multiplicationOnNumMT;
    }

    public ArrayService getSubtractionMT() {
        return subtractionMT;
    }
}
