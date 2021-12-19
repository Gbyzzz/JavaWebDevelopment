package by.gbyzzz.task02javaarrays.beans.factory;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.beans.impl.MyArrayImpl;

public class EntityFactory {
    public MyArray makeNewIntArray(Integer[][] arr) {

        return new MyArrayImpl<Integer>(arr);
    }
    public MyArray makeNewDoubleArray(Double[][] arr) {
        return new MyArrayImpl<Double>(arr);
    }




}
