package test.task03classes;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFlowerByStemLengthTest {

    ServiceFactory serviceFactory = ServiceFactory.getInstance();

@Test
public void findFlowerByStemLengthTest(List<Flowers> flowers, String min, String max, List<Flowers> expected) {
    assertEquals(serviceFactory.getFindFlowerByStemLength().find(flowers, min, max), expected);
}

}
