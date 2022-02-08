package by.gbyzzz.task05multithreading.service.impl.matrix;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;

public class Transpose implements ArrayService {


    @Override
    public MyArray execute(final String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        ValidatorService validatorService = serviceFactory.getValidatorService();
        Number[][] arr1 = matrixOne.getArr();
        Number[][] res = new Number[arr1[0].length][arr1.length];

        if (arr1[0][0]instanceof Integer) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    res[i][j] = arr1[j][i].intValue();
                }
            }
        } else if (arr1[0][0]instanceof Double) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    res[i][j] = arr1[j][i].intValue();
                }
            }
        }
    matrixOne.setArr(res);
        return matrixOne;
    }
}
