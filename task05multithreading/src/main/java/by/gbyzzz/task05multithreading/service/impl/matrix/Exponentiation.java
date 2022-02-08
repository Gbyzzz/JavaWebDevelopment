package by.gbyzzz.task05multithreading.service.impl.matrix;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;

public class Exponentiation implements ArrayService {

    @Override
    public MyArray execute(final String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        ValidatorService validatorService = serviceFactory.getValidatorService();
        Number[][] arr1 = matrixOne.getArr();
        Number[][] res = new Number[arr1.length][arr1[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = 0;
            }
        }
        if (validatorService.matrixSizeEquals(matrixOne, matrixOne)) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    for (int k = 0; k < arr1[0].length; k++) {
                        if (arr1[0][0] instanceof Integer) {
                            res[i][j] = res[i][j].intValue() + arr1[i][k].intValue() * arr1[k][j].intValue();
                        } else if (arr1[0][0] instanceof Double) {
                            res[i][j] = res[i][j].doubleValue() + arr1[i][k].doubleValue() * arr1[k][j].doubleValue();
                        }
                    }
                }
            }
        }
        matrixOne.setArr(res);
        return matrixOne;
    }
}
