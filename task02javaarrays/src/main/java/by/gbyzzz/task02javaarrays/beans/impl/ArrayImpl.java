package by.gbyzzz.task02javaarrays.beans.impl;

import by.gbyzzz.task02javaarrays.beans.Array;

public class ArrayImpl<T extends Number> implements Array {
    T []arr;

    public T[] getArr() {
        return arr;
    }

    public ArrayImpl(T[] arr) {
        this.arr = (T[]) new Number[arr.length];
        this.arr = arr;
    }

    public ArrayImpl() {

    }
}
