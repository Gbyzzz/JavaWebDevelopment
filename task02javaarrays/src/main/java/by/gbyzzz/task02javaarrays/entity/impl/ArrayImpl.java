package by.gbyzzz.task02javaarrays.entity.impl;

import by.gbyzzz.task02javaarrays.entity.Array;

public class ArrayImpl<T extends Number> implements Array {
    T []arr;

    public ArrayImpl(int length) {
        T[]arr = (T[]) new Number[length];
    }
}
