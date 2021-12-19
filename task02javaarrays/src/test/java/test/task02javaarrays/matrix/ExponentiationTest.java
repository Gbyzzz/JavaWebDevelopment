package test.task02javaarrays.matrix;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExponentiationTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "matrix_exponentiation")
    public Object[][] MatrixExponentiationData() {
        return
                new Object[][]{
                        {"test_matrix.txt", new Number[][]{{25, 73,	73,	70},
                                {59, 131, 174, 161},
                                {59, 88, 108, 114},
                                {41, 85, 99, 108}}},
                        {"test_matrix1.txt", new Number[][]{{22, 61, 58},
                        {50, 95, 129},
                        {55, 72, 88}}},
                        {"test_matrix2.txt", new Number[][]{{30, 21, -566, -26},
                                {53, 80, -105, -54},
                                {51, 92, 400, 11},
                                {107, 594, 813, 330}}},
                };
    }


    @Test(dataProvider = "matrix_exponentiation")
    public void matrixExponentiation(String str, Number[][] expected) {
        MyArray arr = arrayServiceFactory.getExponentiation().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}
