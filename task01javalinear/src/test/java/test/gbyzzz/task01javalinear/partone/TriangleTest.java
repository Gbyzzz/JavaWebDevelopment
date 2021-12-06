package test.gbyzzz.task01javalinear.partone;

import by.gbyzzz.task01javalinear.service.GeometryService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleTest {
    GeometryService gs = new GeometryService();
    @DataProvider(name = "triangleHeight")
    public Object[][] triangleHeightCorrectData() {
        return
                new Object[][]{
                        {new double[]{-1}, -0.866}, //not correct input, just to test arithmetics
                        {new double[]{0}, 0},
                        {new double[]{1}, 0.866},
                        {new double[]{3}, 2.598},
                        {new double[]{10}, 8.66},
                        {new double[]{8}, 6.928},
                        {new double[]{100}, 86.602},
                };
    }

    @Test(dataProvider = "triangleHeight")
    public void triangleHeightTest(double arg[], double expected) {
        double actual = gs.triangleHeight(arg[0]);
        assertEquals(actual, expected, 0.001);
    }

    @DataProvider(name = "triangleSr")
    public Object[][] triangleSrCorrectData() {
        return
                new Object[][]{
                        {new double[]{-1}, -0.577},//not correct input, just to test arithmetics
                        {new double[]{0}, 0},
                        {new double[]{1}, 0.577},
                        {new double[]{3}, 1.732},
                        {new double[]{10}, 5.773},
                        {new double[]{8}, 4.618},
                        {new double[]{100}, 57.735},
                };
    }

    @Test(dataProvider = "triangleSr")
    public void triangleSrTest(double arg[], double expected) {
        double actual = gs.triangleDesR(arg[0]);
        assertEquals(actual, expected, 0.001);
    }
    @DataProvider(name = "triangleCr")
    public Object[][] triangleCrCorrectData() {
        return
                new Object[][]{
                        {new double[]{-1}, 0-.288},//not correct input, just to test arithmetics
                        {new double[]{0}, 0},
                        {new double[]{1}, 0.288},
                        {new double[]{3}, 0.866},
                        {new double[]{10}, 2.886},
                        {new double[]{8}, 2.309},
                        {new double[]{100}, 28.867},
                };
    }

    @Test(dataProvider = "triangleCr")
    public void triangleCrTest(double arg[], double expected) {
        double actual = gs.triangleInR(arg[0]);
        assertEquals(actual, expected, 0.001);
    }
    @DataProvider(name = "triangleSq")
    public Object[][] triangleSqCorrectData() {
        return
                new Object[][]{
                        {new double[]{-10}, 43.301},//not correct input, just to test arithmetics
                        {new double[]{0}, 0},
                        {new double[]{1}, 0.433},
                        {new double[]{3}, 3.897},
                        {new double[]{10}, 43.301},
                        {new double[]{8}, 27.712},
                        {new double[]{100}, 4330.127},
                };
    }

    @Test(dataProvider = "triangleSq")
    public void triangleSqTest(double arg[], double expected) {
        double actual = gs.triangleSq(arg[0]);
        assertEquals(actual, expected, 0.001);
    }
}
