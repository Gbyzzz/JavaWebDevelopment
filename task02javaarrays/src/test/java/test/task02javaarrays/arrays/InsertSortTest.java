package test.task02javaarrays.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InsertSortTest {
    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();

    @Test(dataProvider = "sort", dataProviderClass = ArrayDataProvider.class)
    public void insertSortTest(String str, Number[][] expected) {
        MyArray arr = arrayServiceFactory.getInsertSort().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}
