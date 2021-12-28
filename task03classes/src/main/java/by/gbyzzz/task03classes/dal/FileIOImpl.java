package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Flower;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FileIOImpl implements FileIOInterface {

    public AllGoods parseJSON(String file) {
        AllGoods allGoods = null;
       Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        try(FileReader reader = new FileReader(filePath(file))) {

            allGoods = gson.fromJson(reader, AllGoods.class);

        } catch (Exception e){

        }
        return allGoods;

    }

    public String filePath(final String str) {
        // LOGGER.trace("Getting path to the file");
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(str);
        if (resource == null) {
          //  LOGGER.error("File not found");
            throw new IllegalArgumentException("file not found! " + str);
        }
        return resource.getPath();
    }
}