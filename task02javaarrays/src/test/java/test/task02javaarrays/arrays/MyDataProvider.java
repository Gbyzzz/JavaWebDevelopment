package test.task02javaarrays.arrays;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
    @DataProvider(name = "sort")
    public static Object[][] DataForSort() {
        return
                new Object[][]{
                        {"test_array.txt", new Number[][]{{1, 1, 2, 5, 5, 6, 9}}},
                        {"test_array1.txt", new Number[][]{{0, 0, 0, 0, 0, 0, 0}}},
                        {"test_array2.txt", new Number[][]{{-9, 1, 1, 2, 5, 5, 6}}},
                        {"test_array3.txt", new Number[][]{{20, 20, 20, 20}}},
                        {"test_array4.txt", new Number[][]{{5, 70}}},
                        {"test_array5.txt", new Number[][]{{1}}}

                };
    }
}