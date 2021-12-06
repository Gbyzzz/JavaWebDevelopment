package test.gbyzzz.task01javalinear.partthree;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultiplyTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "multiply_correct")
    public Object[][] MultiplyCorrectData() {
        return
                new Object[][]{
                        {new int[]{2, 2}, 4},
                        {new int[]{12, 1}, 12},
                        {new int[]{-1, 0}, 0},
                        {new int[]{0, 0}, 0},
                        {new int[]{-2, -2}, 4},
                        {new int[]{5, 100}, 500},
                        {new int[]{1, 2}, 2},
                };
    }

    @Test(dataProvider = "multiply_correct")
    public void MultiplyTest(int arg[], int expected) {
        int actual = ast.multiply(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
}
