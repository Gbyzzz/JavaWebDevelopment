package test.gbyzzz.task01javalinear.partthree;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RowOfNumsTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "compare_correct")
    public Object[][] RowOfNumsCorrectData() {
        return
                new Object[][]{
                        {new double[]{0.2, 3}, 3.194},
                        {new double[]{0.1, 4}, 3.356},
                        {new double[]{0, 0}, 0},
                        {new double[]{100, 2}, 2},
                        {new double[]{-2, -2}, 18},
                        {new double[]{2, 100}, 2},
                        {new double[]{1, 2}, 2},
                };
    }

    @Test(dataProvider = "compare_correct")
    public void RowOfNumsTest(double arg[], double expected) {
        double actual = ast.rowOfNums(arg[0], (int) arg[1]);
        assertEquals(actual, expected, 0.001);
    }
}
