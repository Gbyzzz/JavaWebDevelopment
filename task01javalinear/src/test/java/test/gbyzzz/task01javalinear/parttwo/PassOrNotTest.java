package test.gbyzzz.task01javalinear.parttwo;

import by.gbyzzz.task01javalinear.service.GeometryService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PassOrNotTest {
    GeometryService gst = new GeometryService();

    @DataProvider(name = "pass_or_not")
    public Object[][] PassOrNotCorrectData() {
        return
                new Object[][]{
                        {new double[]{2, 2, 2, 2, 2}, 0},
                        {new double[]{3, 3, 2, 2, 2}, 1},
                        {new double[]{10, 5, 2, 2, 2}, 1},
                        {new double[]{2, 2, 2, 2, 2}, 0},
                        {new double[]{2, 2, 2, 2, 2}, 0},

                };
    }

    @Test(dataProvider = "pass_or_not")
    public void PassOrNotTest(double arg[], double expected) {
        double actual = gst.passOrNot(arg[0], arg[1], arg[2], arg[3], arg[4]);
        assertEquals(actual, expected);
    }
}
