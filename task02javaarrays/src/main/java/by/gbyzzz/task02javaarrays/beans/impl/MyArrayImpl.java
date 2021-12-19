package by.gbyzzz.task02javaarrays.beans.impl;

import by.gbyzzz.task02javaarrays.beans.MyArray;

import java.util.Arrays;

public class MyArrayImpl<T extends Number> implements MyArray {
    private T[][] arr;

    public T[][] getArr() {
        return arr;
    }

    public void setArr(Number[][] arr) {
        this.arr = (T[][]) arr;
    }


    public MyArrayImpl(T[][] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public MyArrayImpl() {

    }
}
