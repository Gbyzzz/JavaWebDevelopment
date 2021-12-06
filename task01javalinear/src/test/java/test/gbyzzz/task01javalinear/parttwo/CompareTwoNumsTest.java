package test.gbyzzz.task01javalinear.parttwo;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompareTwoNumsTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "compare_correct")
    public Object[][] CompareTwoNumsCorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 2}, 0},
                        {new double[]{2, 1}, 1},
                        {new double[]{0, 0}, 0},
                        {new double[]{100, 2}, 2},
                        {new double[]{-2, -2}, 0},
                        {new double[]{2, 100}, 2},
                        {new double[]{1, 2}, 1},
                };
    }

    @Test(dataProvider = "compare_correct")
    public void CompareTwoNumsTest(double arg[], double expected) {
        double actual = ast.compareTwoNums(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
}
