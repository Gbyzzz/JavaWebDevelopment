package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.AllGoods;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.net.URL;


public class FileIOImpl implements FileIOInterface  {

    @Override
    public void parseJSON(String file) {
       Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        try(FileReader reader = new FileReader(filePath(file))) {
            AllGoods.setAllGoods(gson.fromJson(reader, AllGoods.class));

        } catch (Exception e){

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