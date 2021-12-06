package test.gbyzzz.task01javalinear.partthree;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumMinMaxTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "sum_min_max")
    public Object[][] SumMinMaxCorrectData() {
        return
                new Object[][]{
                        {new int[]{2, 2}, 2},
                        {new int[]{12, 1}, 0},
                        {new int[]{-1, 0}, -1},
                        {new int[]{0, 0}, 0},
                        {new int[]{-2, 0}, -2},
                        {new int[]{5, 9}, 21},
                        {new int[]{1, 3}, 4},
                };
    }

    @Test(dataProvider = "sum_min_max")
    public void SumMinMaxTest(int arg[], int expected) {
        int actual = ast.sumMaxMin(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
}
