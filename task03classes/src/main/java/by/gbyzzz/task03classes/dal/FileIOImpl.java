package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.beans.Goods;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

public class FileIOImpl implements FileIOInterface  {

    @Override
    public List<? extends Goods> parseJSON(String file, List<? extends Goods> obj, Type type) {

       Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        try(FileReader reader = new FileReader(filePath(file))) {
//            Type type = obj.getClass().getGenericSuperclass();
            obj = gson.fromJson(reader, type);

        } catch (Exception e){

        }
        return obj;

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