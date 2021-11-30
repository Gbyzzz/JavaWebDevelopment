package test.gbyzzz.task01javalinear.tasktwo;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompareWithThreeTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "average3_a_b")
    public Object[][] AverageCubedCorrectData() {
        return
                new Object[][]{
                        { 2, 1},
                        { 10, 0},
                        { 3, 2},
                        {-9, 1},
                        {10, 0},
                };
    }

    @Test(dataProvider = "average3_a_b")
    public void AverageCubedTest(double arg[], double expected) {
        double actual = ast.averageCubed(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
}
