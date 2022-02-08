package by.gbyzzz.task04figures.specification;

import by.gbyzzz.task04figures.DataProvider;
import by.gbyzzz.task04figures.dal.fileio.FileIOFactory;
import by.gbyzzz.task04figures.repository.PyramidRepository;
import by.gbyzzz.task04figures.repository.specification.PyramidSpecification;
import by.gbyzzz.task04figures.repository.specification.find.FindPyramidByAreaRange;
import by.gbyzzz.task04figures.repository.specification.find.FindPyramidByName;
import by.gbyzzz.task04figures.repository.specification.find.FindPyramidByParallelAxis;
import by.gbyzzz.task04figures.repository.specification.find.FindPyramidByVolumeRange;
import by.gbyzzz.task04figures.repository.specification.sort.SortPyramidByArea;
import by.gbyzzz.task04figures.repository.specification.sort.SortPyramidByName;
import by.gbyzzz.task04figures.repository.specification.sort.SortPyramidByPerimeter;
import by.gbyzzz.task04figures.repository.specification.sort.SortPyramidByVolume;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTest {
    private static PyramidSpecification specification;
    private static FileIOFactory fileIO = FileIOFactory.getInstance();
    private static PyramidRepository repository = PyramidRepository.getRepository();

    @BeforeAll
    private static void setUp() throws IOException {
        fileIO.getFileIO().parseJSON("pyramid.json", DataProvider.listType);

    }
    @Test
    void findPyramidByAreaRange(){
        specification = new FindPyramidByAreaRange(1000, 5000);
        assertEquals(DataProvider.findPyramidByAreaRange, repository.query(specification));

    }

    @Test
    void findPyramidByName(){
        specification = new FindPyramidByName("Pyramid1");
        assertEquals(DataProvider.findPyramidByName, repository.query(specification));
    }

    @Test
    void findPyramidByParallelAxis(){
        specification = new FindPyramidByParallelAxis("z");
        assertEquals(DataProvider.findPyramidByParallelAxis, repository.query(specification));
    }

    @Test
    void findPyramidByVolume(){
        specification = new FindPyramidByVolumeRange(100.0, 5000.0);
        assertEquals(DataProvider.findPyramidByVolumeRange, repository.query(specification));

    }

    @Test
    void sortPyramidByArea(){
        specification = new SortPyramidByArea();
        assertEquals(DataProvider.sortPyramidByArea, repository.query(specification));
    }

    @Test
    void sortPyramidByName(){
        specification = new SortPyramidByName();
        assertEquals(DataProvider.sortPyramidByName, repository.query(specification));
    }

    @Test
    void sortPyramidByPerimeter(){
        specification = new SortPyramidByPerimeter();
        assertEquals(DataProvider.sortPyramidByPerimeter, repository.query(specification));
    }

    @Test
    void sortPyramidByVolume(){
        specification = new SortPyramidByVolume();
        assertEquals(DataProvider.sortPyramidByVolume, repository.query(specification));
    }
}
