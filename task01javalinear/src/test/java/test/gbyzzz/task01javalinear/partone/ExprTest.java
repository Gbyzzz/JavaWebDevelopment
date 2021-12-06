package test.gbyzzz.task01javalinear.partone;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExprTest {
    ArithmeticService ast = new ArithmeticService();

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
}
