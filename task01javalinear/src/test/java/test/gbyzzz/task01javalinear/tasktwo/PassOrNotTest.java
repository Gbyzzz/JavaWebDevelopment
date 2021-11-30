package test.gbyzzz.task01javalinear.tasktwo;

import by.gbyzzz.task01javalinear.service.ArithmeticService;
import by.gbyzzz.task01javalinear.service.GeometryService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PassOrNotTest {
    GeometryService gst = new GeometryService();

    @DataProvider(name = "average3_a_b")
    public Object[][] AverageCubedCorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 2, 2, 2, 2}, 0},
                        {new double[]{3, 3, 2, 2, 2}, 1},
                        {new double[]{10, 5, 2, 2, 2}, 1},
                        {new double[]{2, 2, 2, 2, 2}, 0},
                        {new double[]{2, 2, 2, 2, 2}, 0},

                };
    }

    @Test(dataProvider = "average3_a_b")
    public void AverageCubedTest(double arg[], double expected) {
        double actual = gst.passOrNot(arg[0], arg[1], arg[2], arg[3], arg[4]);
        assertEquals(actual, expected);
    }
}
