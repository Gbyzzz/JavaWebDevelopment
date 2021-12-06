package test.gbyzzz.task01javalinear.parttwo;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TaskWithTwoNumsTest {
    ArithmeticService ast = new ArithmeticService();

    @DataProvider(name = "task_w_2_nums")
    public Object[][] TaskWithTwoNumsData() {
        return
                new Object[][]{
                        {new double[]{3, 2}, 3},
                        {new double[]{-3, 2}, 2},
                        {new double[]{3, 3}, 0},
                        {new double[]{0, 0}, 0},
                        {new double[]{-6, -3}, -3},
                        {new double[]{-5.5, -5.5}, 0},
                };
    }

    @Test(dataProvider = "task_w_2_nums")
    public void TaskWithTwoNumsTest(double arg[], double expected) {
        double actual = ast.taskWithTwoNums(arg[0], arg[1]);
        assertEquals(actual, expected);
    }
}
