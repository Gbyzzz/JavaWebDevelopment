package by.gbyzzz.task04figures.dal.fileio;

import by.gbyzzz.task04figures.beans.factory.FigureFactory;
import by.gbyzzz.task04figures.beans.Point;
import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.factory.PyramidFactory;
import by.gbyzzz.task04figures.repository.PyramidRepository;
import by.gbyzzz.task04figures.repository.Repository;
import by.gbyzzz.task04figures.services.PyramidServiceFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * This class performs writing and reading data from JSON files.
 * @author Anton Pinchuk
 *
 */

public class FileIOImpl implements FileIOInterface  {
    private static final Logger LOGGER = LogManager.getLogger();
    private PyramidServiceFactory serviceFactory =
            PyramidServiceFactory.getInstance();
    private Repository repository = PyramidRepository.getRepository();
    private FigureFactory factory = new PyramidFactory();

    /**
     * this method parsing data from JSON file, validates and writes to repository.
     * @param file name of parsing JSON file
     */

    @Override
    public void parseJSON(final String file, final Type type) throws IOException {
        GsonBuilder gb = new GsonBuilder();
        gb.registerTypeAdapter(Double.class, new TypeAdapter<Double>() {

            @Override
            public void write(final JsonWriter out, final Double value) {
            }

            @Override
            public Double read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                String stringValue = in.nextString();
                try {
                    Double value = Double.valueOf(stringValue);
                    return value;
                } catch (NumberFormatException e) {
                    LOGGER.error("Not valid data " + e);
                    return null;
                }
            }
        });

        Gson gson = gb.create();
        FileReader reader;
        if (type.equals(new TypeToken<ArrayList<Pyramid>>(){}.getType())) {
            List<Pyramid> pyramids;
            reader = new FileReader(filePath(file));
            pyramids = gson.fromJson(reader, type);
            reader.close();
                for (Pyramid pyramid : pyramids) {
                    if (serviceFactory.getPyramidValidator().validate(pyramid)) {
                        repository.createOrUpdate(pyramid);

                    }
                }
        }
    }
    /**
     * this method reads data from TXT file to ALLGoods class object.
     * @param file name of parsing TXT file
     */

    @Override
    public void parseTXT(final String file, final Type type) throws IOException {
        List<String> list = new ArrayList<>();
        String str;
        BufferedReader in;

            in = new BufferedReader(new FileReader(filePath(file)));
            while ((str = in.readLine()) != null) {
                list.add(str);
            }
                in.close();
        for (Pyramid pyramid : parsePyramid(list)) {
            repository.createOrUpdate(pyramid);
        }
    }
    /**
     * this method parsing data from TXT file to Pyramids and validates them.
     * @param list is a text read from txt file
     *
     */

    private List<Pyramid> parsePyramid (List<String> list) {
        List<Pyramid> pyramids = new ArrayList<>();
        for (String str : list) {
            String[] pyr = str.split(" ");
            List<Point> points = new ArrayList<>();

            try {
                points.add(new Point(Double.parseDouble(pyr[3]), Double.parseDouble(pyr[4]), Double.parseDouble(pyr[5])));
                points.add(new Point(Double.parseDouble(pyr[6]), Double.parseDouble(pyr[7]), Double.parseDouble(pyr[8])));
                Pyramid pyramid = (Pyramid) factory.create(pyr[0], points);
                pyramid.setHeight(Double.parseDouble(pyr[1]));
                pyramid.setHeightParallelAxis(pyr[2]);
                if (serviceFactory.getPyramidValidator().validate(pyramid)) {
                    pyramids.add(pyramid);
                } else {
                    LOGGER.error("Not valid data");
                }
            } catch (NumberFormatException e) {
                LOGGER.error("Not valid data " + e);
            }
        }
        return pyramids;
    }

    /**
     * this method is getting full file path of the file.
     * @param file name file
     * @return filepath
     */

    private String filePath(final String file) {
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
