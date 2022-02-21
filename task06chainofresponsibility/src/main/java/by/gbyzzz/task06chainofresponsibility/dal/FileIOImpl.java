package by.gbyzzz.task06chainofresponsibility.dal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.URL;

/**
 * This class reads data from a txt file and converts it to the
 * type specified in the arg.
 * @author Anton Pinchuk
 *
 */

public final class FileIOImpl implements FileIO {
    private static final Logger LOGGER = LogManager.getLogger();


    @Override
    public String readText(String file) {
        LOGGER.trace("Reading text from txt file " + file);
        String txt = null;
        try {
            FileInputStream reader = new FileInputStream(filePath(file));
            byte[] str = new byte[reader.available()];
            reader.read(str);
            txt = new String(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txt;
    }

    private String filePath(final String str) {
        LOGGER.trace("Getting path to the file");
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            LOGGER.error("File not found");
            throw new IllegalArgumentException("file not found! " + str);
        }
        return resource.getPath();
    }



}

