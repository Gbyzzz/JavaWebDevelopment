package by.gbyzzz.task02javaarrays.entity.factory;

import by.gbyzzz.task02javaarrays.entity.Array;
import by.gbyzzz.task02javaarrays.entity.impl.ArrayImpl;
import by.gbyzzz.task02javaarrays.entity.impl.MatrixImpl;

public class EntityFactory {
    public Array makeNewArray() {
        return new ArrayImpl<>();
    }
    public Array makeNewMatrix() {
        return new MatrixImpl<>();
    }

}
