package test.task03classes;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFlowerByStemLengthTest {

    ServiceFactory serviceFactory = ServiceFactory.getInstance();

    public static Object[][] findFlowerByStemLengthData() {
        return new Object[][]{
                {DataProvider.list, "30", "40", DataProvider.foundStemLengthList}
//                {"30"},
//                {"40"},
//                {foundList}
        };
    }

    @ParameterizedTest
    @MethodSource("findFlowerByStemLengthData")
public void findFlowerByStemLengthTest(List<Flowers> flowers, String min, String max, List<Flowers> expected) {
    assertEquals(expected, serviceFactory.getFindFlowerByStemLength().find(flowers, min, max));
}
}
