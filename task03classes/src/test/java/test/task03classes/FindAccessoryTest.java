package test.task03classes;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.AccessibleObject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAccessoryTest {
    ServiceFactory serviceFactory = ServiceFactory.getInstance();

    public static Object[][] findAccessoryData() {
        return new Object[][]{
                {DataProvider.accessoriesList1, "ribbon", "red", DataProvider.foundAccessory1}
        };
    }

    @ParameterizedTest
    @MethodSource("findAccessoryData")
    public void findAccessoryTest(List<Accessories> accessories, String type, String color, List<Accessories> expected) {
        List<Accessories> actual = serviceFactory.getFindAccessory().find(accessories, type, color);
        assertEquals(expected, serviceFactory.getFindAccessory().find(accessories, type, color));
    }
}