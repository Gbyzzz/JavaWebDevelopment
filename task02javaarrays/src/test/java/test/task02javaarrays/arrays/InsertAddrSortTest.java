package test.task02javaarrays.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InsertAddrSortTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @DataProvider(name = "sort")
    public Object[][] InsertAddrSortData() {
        return
                new Object[][]{
                        {"test_array.txt", new Number[][]{{1, 2, 5, 6, 9}}},
                        {"test_array1.txt", new Number[][]{{0}}},
                        {"test_array2.txt", new Number[][]{{-9, 1, 2, 5, 6}}},
                        {"test_array3.txt", new Number[][]{{20}}},
                        {"test_array4.txt", new Number[][]{{5, 70}}},
                        {"test_array5.txt", new Number[][]{{1}}}

                };
    }


    @Test(dataProvider = "sort")
    public void insertAddrSortTest(String str, Number[][] expected) {
        MyArray arr = arrayServiceFactory.getInsertAddrSort().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}

