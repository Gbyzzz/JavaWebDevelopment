package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.DataProvider;
import by.gbyzzz.task04figures.beans.Registrator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidCalculationsImplTest {

    private static PyramidServiceFactory pyramidCalculations = PyramidServiceFactory.getInstance();
    private static Registrator registrator = new Registrator();
    @BeforeAll
    public static void setUp() {
        pyramidCalculations.getPyramidCalculations().calc(DataProvider.pyramid, registrator);
    }

    @Test
    void calcArea() {
        assertEquals(DataProvider.pyramidReg.getArea(), registrator.getArea(), 0.1);
    }
    @Test
    void calcPerimeter() {
        assertEquals(DataProvider.pyramidReg.getPerimeter(), registrator.getPerimeter(), 0.1);
    }
    @Test
    void calcVolume() {
        assertEquals(DataProvider.pyramidReg.getVolume(), registrator.getVolume(), 0.1);
    }
    @Test
    void calcRatio() {
        assertEquals(DataProvider.pyramidReg.getRatio(), registrator.getRatio(), 0.1);
    }
    @Test
    void calcIsOnAxis(){
        assertEquals(DataProvider.pyramidReg.isOnAxis(), registrator.isOnAxis());
    }

}