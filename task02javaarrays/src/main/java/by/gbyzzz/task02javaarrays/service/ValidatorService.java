package by.gbyzzz.task02javaarrays.service;

import by.gbyzzz.task02javaarrays.beans.MyArray;

import java.util.Scanner;

public interface ValidatorService {
    int rangeInt(final Scanner in, final int min, final int max);
    boolean matrixSizeEquals(MyArray arr1, MyArray arr2);
    boolean matrixEqualsForMult(MyArray arr1, MyArray arr2);
}
