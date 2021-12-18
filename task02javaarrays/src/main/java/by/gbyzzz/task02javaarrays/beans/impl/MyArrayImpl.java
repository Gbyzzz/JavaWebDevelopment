package by.gbyzzz.task02javaarrays.beans.impl;

import by.gbyzzz.task02javaarrays.beans.MyArray;

public class MyArrayImpl<T extends Number> implements MyArray {
    T [][] arr;

    public T [][] getArr() {
        return arr;
    }

    public void setArr(Number[][] arr) {
        this.arr = (T[][]) arr;
    }


    public MyArrayImpl(T[][] arr) {
        this.arr = arr;
    }

    public MyArrayImpl() {

    }
}
