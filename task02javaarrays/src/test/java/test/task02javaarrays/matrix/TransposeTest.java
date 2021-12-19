package test.task02javaarrays.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TransposeTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "matrix_transpose")
    public Object[][] MatrixTransposeData() {
        return
                new Object[][]{
                        {"test_matrix.txt",
                                new Number[][]{{1, 7,	1,	1},
                                {2, 5, 7, 4},
                                {7, 8, 5, 5},
                                {3, 9, 4, 7}}},
                        {"test_matrix1.txt",
                                new Number[][]{{1, 7, 1},
                                {2, 5, 7},
                                {7, 8, 5}}},
                        {"test_matrix2.txt",
                                new Number[][]{{1, 7, 1, -1},
                                {2, 5, 7, 5},
                                {7, 8, 5, 78},
                                {-8, -3, 4, 5}}},
                };
    }


    @Test(dataProvider = "matrix_transpose")
    public void matrixTranspose(String str, Number[][] expected) {
        MyArray arr = arrayServiceFactory.getTranspose().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}
