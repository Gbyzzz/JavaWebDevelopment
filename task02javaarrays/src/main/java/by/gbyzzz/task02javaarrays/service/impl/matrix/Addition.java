package by.gbyzzz.task02javaarrays.service.impl.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class Addition implements ArrayService {
    @Override
    public MyArray execute(final String... matrix) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MyArray matrixOne = fileIOFactory.getFileIO().readFileToArray(matrix[0]);
        MyArray matrixTwo = fileIOFactory.getFileIO().readFileToArray(matrix[1]);
        ValidatorService validatorService = serviceFactory.getValidatorService();
        Number[][] arr1 = matrixOne.getArr();
        Number[][] arr2 = matrixTwo.getArr();
        Number[][] res = matrixTwo.getArr();
        if (validatorService.matrixSizeEquals(matrixOne, matrixTwo)) {
            if (arr1[0][0]instanceof Integer) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    res[i][j] = arr1[i][j].intValue() + arr2[i][j].intValue();
                }
            }
        } else if (arr1[0][0]instanceof Double) {
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                        res[i][j] = arr1[i][j].doubleValue() + arr2[i][j].doubleValue();
                    }
                }
            }
        }
        matrixOne.setArr(res);
        fileIOFactory.getFileIO().arrayWriteToFile(matrixOne, matrix[0]);
        return matrixOne;
    }
}
