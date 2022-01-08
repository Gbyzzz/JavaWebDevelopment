package test.task03classes;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortBouquetByCutDateTest {

    ServiceFactory serviceFactory = ServiceFactory.getInstance();

    public static Object[][] findFlowerByTypeTest() {
        return new Object[][]{
                {DataProvider.flowersList1, "rose", DataProvider.sortedFlowersList1},
                {DataProvider.flowersList2, "rose", DataProvider.sortedFlowersList2}
        };
    }

    @ParameterizedTest
    @MethodSource("findFlowerByTypeTest")
    public void findFlowerByTypeTest(List<Flowers> flowers, String type, List<Flowers> expected) {
        serviceFactory.getSortBouquetByCutDate().sort(flowers);
        assertEquals(expected, flowers);
    }
}