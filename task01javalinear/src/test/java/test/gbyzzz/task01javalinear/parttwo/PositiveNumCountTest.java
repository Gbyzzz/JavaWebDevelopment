package test.gbyzzz.task01javalinear.parttwo;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveNumCountTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "positive_num_count")
    public Object[][] PositiveNumCountCorrectData() {
        return
                new Object[][]{
                        {new double[]{1, 2, 3}, 3},
                        {new double[]{-1, 0, 0}, 0},
                        {new double[]{1, -2, 3}, 2},
                        {new double[]{-1, 1, 0}, 1},
                        {new double[]{1, 2.5, -3}, 2},
                        {new double[]{0, 0, 0}, 0},

                };
    }

    @Test(dataProvider = "positive_num_count")
    public void PositiveNumCountTest(double arg[], double expected) {
        double actual = ast.positiveNumCount(arg[0], arg[1], arg[2]);
        assertEquals(actual, expected);
    }
}
