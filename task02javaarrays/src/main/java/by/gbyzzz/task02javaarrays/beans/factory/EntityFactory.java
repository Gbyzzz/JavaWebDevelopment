package by.gbyzzz.task02javaarrays.beans.factory;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.beans.impl.ArrayImpl;
import by.gbyzzz.task02javaarrays.beans.impl.MatrixImpl;

public class EntityFactory {
    public Array makeNewArray(Number[] arr) {
        return new ArrayImpl<>();
    }
    public Array makeNewMatrix() {
        return new MatrixImpl<>();
    }

}
