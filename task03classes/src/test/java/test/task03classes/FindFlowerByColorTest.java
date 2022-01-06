package test.task03classes;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFlowerByColorTest {

    ServiceFactory serviceFactory = ServiceFactory.getInstance();

    public static Object[][] findFlowerByColorData() {
        return new Object[][]{
                {DataProvider.list, "red", DataProvider.foundColorList}
//                {"30"},
//                {"40"},
//                {foundList}
        };
    }

    @ParameterizedTest
    @MethodSource("findFlowerByColorData")
    public void findFlowerByColorTest(List<Flowers> flowers, String color, List<Flowers> expected) {
        assertEquals(expected, serviceFactory.getFindFlowerByColor().find(flowers, color));
    }
}
