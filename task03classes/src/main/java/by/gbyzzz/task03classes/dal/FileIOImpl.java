package by.gbyzzz.task03classes.dal;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileIOImpl implements FileIOInterface {

    public Object parseJSON(String file) {
        Gson gson = new Gson();

        Object object = null;

        {
            try {
                object = gson.fromJson(new FileReader(file), Object.class);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return object;
    }
}
