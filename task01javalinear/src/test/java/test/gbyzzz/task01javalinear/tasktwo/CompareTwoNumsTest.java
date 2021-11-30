package test.gbyzzz.task01javalinear.tasktwo;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompareTwoNumsTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "average3_a_b")
    public Object[][] AverageCubedCorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 2}, 0},
                        {new double[]{2, 1}, 1},
                        {new double[]{0, 0}, 0},
                        {new double[]{100, 2}, 2},
                        {new double[]{-2, -2}, 0},
                };
    }

    @Test(dataProvider = "average3_a_b")
    public void AverageCubedTest(double arg[], double expected) {
        double actual = ast.averageCubed(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
}
