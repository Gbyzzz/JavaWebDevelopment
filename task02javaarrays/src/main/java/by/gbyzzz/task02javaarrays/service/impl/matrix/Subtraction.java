package by.gbyzzz.task02javaarrays.service.impl.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class Subtraction implements ArrayService {
    @Override
    public MyArray execute(String... matrix) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        MyArray matrixOne = fileIOServiceImpl.readFileToArray(matrix[0]);
        MyArray matrixTwo = fileIOServiceImpl.readFileToArray(matrix[1]);
        ValidatorService validatorService = serviceFactory.getValidatorService();
        Number[][] arr1 = matrixOne.getArr();
        Number[][] arr2 = matrixTwo.getArr();
        Number[][] res = matrixTwo.getArr();
        if(validatorService.matrixSizeEquals(matrixOne, matrixTwo)) {


            if(arr1[0][0]instanceof Integer){
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                        res[i][j] = arr1[i][j].intValue() - arr2[i][j].intValue();
                    }
                }
            } else if(arr1[0][0]instanceof Double){
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                        res[i][j] = arr1[i][j].doubleValue() - arr2[i][j].doubleValue();
                    }
                }
            }
        } else {

        }
        matrixOne.setArr(res);
        return matrixOne;
    }
}
