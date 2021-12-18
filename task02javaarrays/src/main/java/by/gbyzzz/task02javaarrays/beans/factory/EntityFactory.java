package by.gbyzzz.task02javaarrays.beans.factory;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.beans.impl.MyArrayImpl;
import by.gbyzzz.task02javaarrays.beans.impl.MatrixImpl;

public class EntityFactory {
    public MyArray makeNewIntArray(Integer[][] arr) {

        return new MyArrayImpl<Integer>(arr);
    }
    public MyArray makeNewDoubleArray(Double[][] arr) {
        return new MyArrayImpl<Double>(arr);
    }
    public MyArray makeNewIntMatrix() {
        return new MatrixImpl<Integer>();
    }
    public MyArray makeNewDoubleMatrix() {
        return new MatrixImpl<Double>();
    }




}
