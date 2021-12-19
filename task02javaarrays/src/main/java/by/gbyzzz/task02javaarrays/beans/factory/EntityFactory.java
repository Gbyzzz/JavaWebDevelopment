package by.gbyzzz.task02javaarrays.beans.factory;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.beans.impl.MyArrayImpl;

public class EntityFactory {
    public MyArray makeNewIntArray(final Integer[][] arr) {

        return new MyArrayImpl<Integer>(arr);
    }
    public MyArray makeNewDoubleArray(final Double[][] arr) {
        return new MyArrayImpl<Double>(arr);
    }




}
