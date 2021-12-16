package test.task02javaarrays.arrays;

import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SelectSortTest {

    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "select_sort")
    public Object[][] averageCorrectData() {
        return
                new Object[][]{
                        {new double[]{5, 7, 4, 8}, new double[]{4, 5, 7, 8}},
                        {new double[]{1, 1, 8, 1}, new double[]{1, 1, 1, 8}},
                        {new double[]{5, 7}, new double[]{5, 7}},
                        {new double[]{5, 7}, new double[]{5, 7}},
                        {new double[]{5, 7}, new double[]{5, 7}},
                        {new double[]{7, 5}, new double[]{5, 7}},
                };
    }

    @Test(dataProvider = "select_sort")
    public void averageTest(double arg[], double[] expected) {
//        double[] actual = arrayServiceFactory.getSelectSort().sort(arg);
//        assertEquals(actual, expected);
    }
}
