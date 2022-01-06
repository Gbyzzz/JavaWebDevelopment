package test.task03classes;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFlowerByTypeTest {

    ServiceFactory serviceFactory = ServiceFactory.getInstance();

    public static Object[][] findFlowerByTypeTest() {
        return new Object[][]{
                {DataProvider.list, "rose", DataProvider.foundTypeList}
//                {"30"},
//                {"40"},
//                {foundList}
        };
    }

    @ParameterizedTest
    @MethodSource("findFlowerByTypeTest")
    public void findFlowerByTypeTest(List<Flowers> flowers, String type, List<Flowers> expected) {
        assertEquals(expected, serviceFactory.getFindFlowerByType().find(flowers, type));
    }
}