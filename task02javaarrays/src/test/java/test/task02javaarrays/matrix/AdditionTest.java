package test.task02javaarrays.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AdditionTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "matrix_addition")
    public Object[][] MatrixAdditionData() {
        return
                new Object[][]{
                        {new String[] {"test_matrix.txt", "test_matrix2.txt"},
                                new Number[][]{{2, 4, 14, -5},
                                {14, 10, 16, 6},
                                {2 , 14, 10, 8},
                                {0, 9, 83, 12}}},
                        {new String[] {"test_matrix.txt", "test_matrix.txt"},
                                new Number[][]{{2, 4, 14, 6},
                                        {14, 10, 16, 18},
                                        {2 , 14, 10, 8},
                                        {2, 8, 10, 14}}},
                };
    }


    @Test(dataProvider = "matrix_addition")
    public void matrixAddition(String str[], Number[][] expected) {
        MyArray arr = arrayServiceFactory.getAddition().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}