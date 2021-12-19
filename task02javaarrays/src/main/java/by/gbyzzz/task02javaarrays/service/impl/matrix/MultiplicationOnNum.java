package by.gbyzzz.task02javaarrays.service.impl.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class MultiplicationOnNum implements ArrayService {


    @Override
    public MyArray execute(String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        Number[][] arr1 = matrixOne.getArr();


        if (arr1[0][0] instanceof Integer) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr1[i][j] = arr1[i][j].intValue() * Integer.parseInt(matrix[1]);
                }
            }
        } else if (arr1[0][0] instanceof Double) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr1[i][j] = arr1[i][j].doubleValue() * Double.parseDouble(matrix[1]);
                }
            }
        }

        return matrixOne;
    }
}


