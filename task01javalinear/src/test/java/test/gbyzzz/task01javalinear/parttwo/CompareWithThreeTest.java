package test.gbyzzz.task01javalinear.parttwo;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompareWithThreeTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "compare_w_3")
    public Object[][] CompareWithThreeCorrectData() {
        return
                new Object[][]{
                        { 2, 1},
                        { 10, -1},
                        { 3, 0},
                        {-9, 1},
                        {10, -1},
                };
    }

    @Test(dataProvider = "compare_w_3")
    public void CompareWithThreeTest(double arg, double expected) {
        double actual = ast.compareWithThree(arg);
        assertEquals(actual, expected);
    }
}
