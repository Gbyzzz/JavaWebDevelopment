package by.gbyzzz.task04figures.dal.fileio;

import by.gbyzzz.task04figures.beans.Pyramid;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

/**
 * This class performs writing and reading data from JSON files.
 * @author Anton Pinchuk
 *
 */

public class FileIOImpl implements FileIOInterface  {
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * this method parsing data from JSON file to ALLGoods class object.
     * @param file name of parsing JSON file
     * @return
     */

    @Override
    public List parseJSON(String file, Type type) {
       Gson gson = new GsonBuilder().create();
        FileReader reader = null;
        try {
            reader = new FileReader(filePath(file));
        } catch (FileNotFoundException e) {
            LOGGER.error("File not found" + e);
            e.printStackTrace();
        }
        List<Pyramid> arr = gson.fromJson(reader, type);
       return arr;

    }

    @Override
    public void parseTXT(String file) {
        Scanner scanner = new Scanner(filePath(file));

    }


    /**
     * this method is getting full file path of the file.
     * @param file name file
     */

    public String filePath(final String file) {
        LOGGER.trace("Getting path to the file");
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(file);
        if (resource == null) {
            LOGGER.error("File not found");
            throw new IllegalArgumentException("file not found! " + file);
        }
        return resource.getPath();
    }
}