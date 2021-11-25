package test.gbyzzz.task01javalinear;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticServiceTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "avarage_a_b")
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

    @Test(dataProvider = "avarage_a_b")
    public void averageTest(double arg[], double expected) {
        double actual = ast.average(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
    @DataProvider(name = "avarage3_a_b")
    public Object[][] average3CorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 2}, 8},
                        {new double[]{1, 1}, 1},
                        {new double[]{0, 0}, 0},
                        {new double[]{-2, 2}, 0},
                        {new double[]{-2, -2}, -8},
                };
    }

    @Test(dataProvider = "avarage3_a_b")
    public void average3Test(double arg[], double expected) {
        double actual = ast.average3(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
    @DataProvider(name = "expr")
    public Object[][] exprCorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 2}, 4},
                        {new double[]{1, 1}, -3},
                        {new double[]{0, 0}, -10},
                        {new double[]{2, 3}, 9},
                };
    }

    @Test(dataProvider = "expr")
    public void exprTest(double arg[], double expected) {
        double actual = ast.expr(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
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