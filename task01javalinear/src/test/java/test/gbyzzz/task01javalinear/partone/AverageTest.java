package test.gbyzzz.task01javalinear.partone;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AverageTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "average_a_b")
    public Object[][] averageCorrectData() {
        return
                new Object[][]{
                        {new double[]{5, 7}, 6},
                        {new double[]{1, 1}, 1},
                        {new double[]{0, 0}, 0},
                        {new double[]{-1, 1}, 0},
                        {new double[]{1, 5}, 3},
                };
    }

    @Test(dataProvider = "average_a_b")
    public void averageTest(double arg[], double expected) {
        double actual = ast.average(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
}
