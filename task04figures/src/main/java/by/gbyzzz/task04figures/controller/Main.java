package by.gbyzzz.task04figures.controller;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.dal.fileio.FileIOFactory;
import by.gbyzzz.task04figures.repository.PyramidRepository;
import by.gbyzzz.task04figures.repository.Repository;
import by.gbyzzz.task04figures.repository.specification.PyramidSpecification;
import by.gbyzzz.task04figures.repository.specification.find.FindPyramidByAreaRange;
import by.gbyzzz.task04figures.repository.specification.sort.SortPyramidByPerimeter;
import com.google.gson.reflect.TypeToken;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws IOException {

        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        Repository pyramidRepository = PyramidRepository.getRepository();
        Type listType = new TypeToken<ArrayList<Pyramid>>(){}.getType();
        LOGGER.trace("Program started");

        List<Pyramid> pyramidList = null;

            fileIOFactory.getFileIO().parseJSON("pyramid.json", listType);

        System.out.println(pyramidRepository);

        System.out.println();

            fileIOFactory.getFileIO().parseJSON("pyramid1.json", listType);

        System.out.println(pyramidRepository);


            fileIOFactory.getFileIO().parseTXT("pyramid1.txt", listType);

        System.out.println(pyramidRepository);

        PyramidSpecification specification = new SortPyramidByPerimeter();
        System.out.println("Sorted:");
        System.out.println(pyramidRepository.query(specification));
        specification = new FindPyramidByAreaRange(1000, 10000);
        System.out.println("Found:");
        System.out.println(pyramidRepository.query(specification));
    }
}
