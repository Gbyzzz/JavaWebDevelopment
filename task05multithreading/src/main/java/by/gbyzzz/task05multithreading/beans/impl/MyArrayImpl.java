package by.gbyzzz.task05multithreading.beans.impl;

import by.gbyzzz.task05multithreading.beans.MyArray;

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
        return String.valueOf(arr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayImpl<?> myArray = (MyArrayImpl<?>) o;
        return Arrays.equals(arr, myArray.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    public MyArrayImpl() {


    }
}
