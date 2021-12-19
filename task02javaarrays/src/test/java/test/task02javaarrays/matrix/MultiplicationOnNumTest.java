package test.task02javaarrays.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultiplicationOnNumTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "matrix_multiplication_on_num")
    public Object[][] MatrixMultiplicationOnNumData() {
        return
                new Object[][]{
                        {new String[] {"test_matrix.txt", "5"},
                                new Number[][]{{5, 10,	35, 15},
                                        {35, 25, 40, 45},
                                        {5, 35, 25, 20},
                                        {5, 20, 25, 35}}},
                        {new String[] {"test_matrix.txt", "6"},
                                new Number[][]{{6, 12, 42, 18},
                                        {42, 30, 48, 54},
                                        {6, 42, 30, 24},
                                        {6, 24, 30, 42}}},
                };
    }


    @Test(dataProvider = "matrix_multiplication_on_num")
    public void matrixMultiplicationOnNum(String str[], Number[][] expected) {
        MyArray arr = arrayServiceFactory.getMultiplicationOnNum().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}