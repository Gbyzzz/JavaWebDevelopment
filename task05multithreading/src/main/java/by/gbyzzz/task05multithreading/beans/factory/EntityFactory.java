package by.gbyzzz.task05multithreading.beans.factory;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.beans.impl.MyArrayImpl;

public class EntityFactory {
    public MyArray makeNewIntArray(final Integer[][] arr) {

        return new MyArrayImpl<Integer>(arr);
    }
    public MyArray makeNewDoubleArray(final Double[][] arr) {
        return new MyArrayImpl<Double>(arr);
    }




}
