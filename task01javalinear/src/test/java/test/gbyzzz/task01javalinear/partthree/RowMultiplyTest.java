package test.gbyzzz.task01javalinear.partthree;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RowMultiplyTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "row_multiply")
    public Object[][] RowMultiplyCorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 2}, 6},
                        {new double[]{2, 1}, 2},
                        {new double[]{0, 0}, 0},
                        {new double[]{100, 2}, 10100},
                        {new double[]{-2, -2}, -2},
                        {new double[]{2, 3}, 24},
                        {new double[]{1, 2}, 2},
                };
    }

    @Test(dataProvider = "row_multiply")
    public void RowMultiplyTest(double arg[], double expected) {
        double actual = ast.rowMultiply(arg[0], (int) arg[1]);
        assertEquals(actual, expected);
    }
}
