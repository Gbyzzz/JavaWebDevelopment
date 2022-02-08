package by.gbyzzz.task05multithreading.service.impl.matrixmultithreading;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;
import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;

import java.util.concurrent.Callable;

public class MultiplicationMT implements ArrayService, Callable<MyArray> {
    @Override
    public MyArray execute(String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        MyArray matrixTwo = fileIOFactory.getFileIO().readFileToArray(matrix[1]);
        ValidatorService validatorService = serviceFactory.getValidatorService();
        Number[][] arr1 = matrixOne.getArr();
        Number[][] arr2 = matrixTwo.getArr();
        Number[][] res = new Number[arr1.length][arr2[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = 0;
            }
        }
        if (validatorService.matrixEqualsForMult(matrixOne, matrixTwo)) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    for (int k = 0; k < arr1[0].length; k++) {
                        if (arr1[0][0] instanceof Integer) {
                            res[i][j] = res[i][j].intValue() + arr1[i][k].intValue() * arr2[k][j].intValue();
                        } else if (arr1[0][0] instanceof Double) {
                            res[i][j] = res[i][j].doubleValue() + arr1[i][k].doubleValue() * arr2[k][j].doubleValue();
                        }
                    }
                }
            }
        }
        matrixOne.setArr(res);
        return matrixOne;
    }

    @Override
    public MyArray call() throws Exception {
        return null;
    }
}
