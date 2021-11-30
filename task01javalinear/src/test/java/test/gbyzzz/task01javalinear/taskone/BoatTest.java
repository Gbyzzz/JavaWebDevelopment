package test.gbyzzz.task01javalinear.taskone;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BoatTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "boat")
    public Object[][] boatCorrectData() {
        return
                new Object[][]{
                        {new double[]{0, 0, 0, 0}, 0},
                        {new double[]{10, 10, 1, 1}, 10},
                        {new double[]{10, 0, 1, 1}, 20},
                        {new double[]{10, 5, 1, 1}, 15},
                        {new double[]{5, 10, 1, 1}, 10},
                };
    }

    @Test(dataProvider = "boat")
    public void boatTest(double arg[], double expected) {
        double actual = ast.boat(arg[0], arg[1], arg[2], arg[3]);
        assertEquals(actual, expected);
    }
}
