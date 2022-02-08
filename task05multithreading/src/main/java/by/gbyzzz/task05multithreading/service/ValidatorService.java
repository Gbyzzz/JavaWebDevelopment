package by.gbyzzz.task05multithreading.service;



import by.gbyzzz.task05multithreading.beans.MyArray;

import java.util.Scanner;

public interface ValidatorService {
    int rangeInt(Scanner in, int min, int max);
    boolean matrixSizeEquals(MyArray arr1, MyArray arr2);
    boolean matrixEqualsForMult(MyArray arr1, MyArray arr2);
}
