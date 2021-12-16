package by.gbyzzz.task02javaarrays.beans.factory;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.beans.impl.ArrayImpl;
import by.gbyzzz.task02javaarrays.beans.impl.MatrixImpl;

public class EntityFactory {
    public Array makeNewIntArray(Integer[] arr) {

        return new ArrayImpl<Integer>(arr);
    }
    public Array makeNewDoubleArray(Double[] arr) {
        return new ArrayImpl<Double>(arr);
    }
    public Array makeNewIntMatrix() {
        return new MatrixImpl<Integer>();
    }
    public Array makeNewDoubleMatrix() {
        return new MatrixImpl<Double>();
    }




}
