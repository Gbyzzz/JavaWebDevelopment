package test.task02javaarrays.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubtractionTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "matrix_subtraction")
    public Object[][] MatrixSubtractionData() {
        return
                new Object[][]{
                        {new String[] {"test_matrix.txt", "test_matrix2.txt"},
                                new Number[][]{{0, 0, 0, 11},
                                        {0, 0, 0, 12},
                                        {0 , 0, 0, 0},
                                        {2, -1, -73, 2}}},
                        {new String[] {"test_matrix.txt", "test_matrix.txt"},
                                new Number[][]{{0, 0, 0, 0},
                                        {0, 0, 0, 0},
                                        {0 , 0, 0, 0},
                                        {0, 0, 0, 0}}},
                };
    }


    @Test(dataProvider = "matrix_subtraction")
    public void matrixSubtraction(String str[], Number[][] expected) {
        MyArray arr = arrayServiceFactory.getSubtraction().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}