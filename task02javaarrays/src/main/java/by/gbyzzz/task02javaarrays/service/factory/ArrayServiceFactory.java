package by.gbyzzz.task02javaarrays.service.factory;

import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.MatrixService;
import by.gbyzzz.task02javaarrays.service.impl.arrays.*;
import by.gbyzzz.task02javaarrays.service.impl.matrix.*;

public class ArrayServiceFactory {
    private static final ArrayServiceFactory instance = new ArrayServiceFactory();
    private final ArrayService bubbleSort = new BubbleSort();
    private final ArrayService shakeSort = new ShakeSort();
    private final ArrayService selectSort = new SelectSort();
    private final ArrayService insertSort = new InsertSort();
    private final ArrayService shellSort = new ShellSort();
    private final ArrayService mergeSort = new MergeSort();
    private final ArrayService insertAddrSort = new InsertAddrSort();
    private final ArrayService externalSort = new ExternalSort();
    private final MatrixService addition = new Addition();
    private final MatrixService exponentiation = new Exponentiation();
    private final MatrixService multiplication = new Multiplication();
    private final MatrixService multiplicationOnNum = new MultiplicationOnNum();
    private final MatrixService subtraction = new Subtraction();
    private final MatrixService transpose = new Transpose();

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

    public MatrixService getAddition() {
        return addition;
    }

    public MatrixService getExponentiation() {
        return exponentiation;
    }

    public MatrixService getMultiplication() {
        return multiplication;
    }

    public MatrixService getMultiplicationOnNum() {
        return multiplicationOnNum;
    }

    public MatrixService getSubtraction() {
        return subtraction;
    }

    public MatrixService getTranspose() {
        return transpose;
    }
}
