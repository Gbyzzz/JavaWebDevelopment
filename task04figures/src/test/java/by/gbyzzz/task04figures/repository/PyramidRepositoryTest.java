package by.gbyzzz.task04figures.repository;

import by.gbyzzz.task04figures.DataProvider;
import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import by.gbyzzz.task04figures.dal.fileio.FileIOFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PyramidRepositoryTest {

    private static FileIOFactory fileIO = FileIOFactory.getInstance();
    private static PyramidRepository repository = PyramidRepository.getRepository();

    @BeforeAll
    static void setUp() throws IOException {
        fileIO.getFileIO().parseTXT("pyramid.txt", DataProvider.listType);
    }

    @Test
    void read() {
        HashMap<Integer,HashMap<Pyramid, Registrator>> testRep = new HashMap<>();
        HashMap<Pyramid, Registrator> pyrReg = new HashMap<>();
        HashMap<Pyramid, Registrator> pyrReg1 = new HashMap<>();
        pyrReg.put(DataProvider.pyramid, DataProvider.pyramidReg);
        testRep.put(1, pyrReg);
        pyrReg1.put(DataProvider.pyramid1, DataProvider.pyramidReg1);
        testRep.put(2, pyrReg1);
        assertEquals(testRep, repository.read());


    }

    @Test
    void createOrUpdate() {
    }

    @Test
    void remove() {
    }


    @Test
    void query() {
    }
}