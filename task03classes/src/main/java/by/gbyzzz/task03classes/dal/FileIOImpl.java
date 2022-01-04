package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Bouquet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.URL;
import java.util.List;


public class FileIOImpl implements FileIOInterface  {

    @Override
    public void parseJSON(String file) {
       Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        try(FileReader reader = new FileReader(filePath(file))) {
            AllGoods.setAllGoods(gson.fromJson(reader, AllGoods.class));

        } catch (Exception e){

        }
    }

    @Override
    public void writeJSON(String file) {

        try (Writer writer = new FileWriter(filePath(file))) {
            Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").setPrettyPrinting().create();
            gson.toJson(AllGoods.getGenerator(), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
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