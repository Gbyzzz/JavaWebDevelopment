package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.AllGoods;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.URL;

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
     */

    @Override
    public void parseJSON(String file) {
       Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        FileReader reader = null;
        try {
            reader = new FileReader(filePath(file));
        } catch (FileNotFoundException e) {
            LOGGER.error("File not found" + e);
            e.printStackTrace();
        }
        AllGoods.setAllGoods(gson.fromJson(reader, AllGoods.class));


    }

    /**
     * this method writing data to JSON file from ALLGoods class object.
     * @param file name of parsing JSON file
     */

    @Override
    public void writeJSON(String file) {

        try (Writer writer = new FileWriter(filePath(file))) {
            Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").setPrettyPrinting().create();
            gson.toJson(AllGoods.getGenerator(), writer);
        } catch (IOException e) {
            LOGGER.error("Error while writing data to JSON file" + e);
            e.printStackTrace();
        }
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