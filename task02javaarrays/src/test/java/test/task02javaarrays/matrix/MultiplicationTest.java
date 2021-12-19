package test.task02javaarrays.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultiplicationTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "matrix_multiplication")
    public Object[][] MatrixMultiplicationData() {
        return
                new Object[][]{
                        {new String[] {"test_matrix.txt", "test_matrix2.txt"},
                                new Number[][]{{19, 76,	292, 29},
                                        {41, 140, 831, 6},
                                        {51, 92, 400, 11},
                                        {27, 92, 610, 35}}},
                        {new String[] {"test_matrix.txt", "test_matrix.txt"},
                                new Number[][]{{25, 73,	73,	70},
                                        {59, 131, 174, 161},
                                        {59, 88, 108, 114},
                                        {41, 85, 99, 108}}},
                };
    }


    @Test(dataProvider = "matrix_multiplication")
    public void matrixMultiplication(String str[], Number[][] expected) {
        MyArray arr = arrayServiceFactory.getMultiplication().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}
