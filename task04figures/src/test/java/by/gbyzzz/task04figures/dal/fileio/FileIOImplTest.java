package by.gbyzzz.task04figures.dal.fileio;

import by.gbyzzz.task04figures.DataProvider;
import by.gbyzzz.task04figures.beans.Pyramid;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileIOImplTest {
    private static FileIOFactory fileIO = FileIOFactory.getInstance();


    @Test
    void parseJSON() throws IOException {
        List<Pyramid> pyramids = null;

        fileIO.getFileIO().parseJSON("pyramid.json", DataProvider.listType);
       assertEquals(DataProvider.pyramidListTrue, pyramids);
        assertNotEquals(DataProvider.pyramidListFalse, pyramids);
    }

    @Test
    void parseTXT() throws IOException {
        List<Pyramid> pyramids = null;

            fileIO.getFileIO().parseTXT("pyramid.txt", DataProvider.listType);

        assertEquals(DataProvider.pyramidListTrue, pyramids);
        assertNotEquals(DataProvider.pyramidListFalse, pyramids);
    }
}