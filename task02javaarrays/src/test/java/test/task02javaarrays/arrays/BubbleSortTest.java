package test.task02javaarrays.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.factory.ArrayServiceFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class BubbleSortTest {

    ArrayServiceFactory arrayServiceFactory = ArrayServiceFactory.getInstance();


    @Test(dataProvider = "sort", dataProviderClass = ArrayDataProvider.class)
    public void bubbleSortTest(String str, Number[][] expected) {
        MyArray arr = arrayServiceFactory.getBubbleSort().execute(str);
        assertEquals(arr.getArr(), expected);
    }
}
