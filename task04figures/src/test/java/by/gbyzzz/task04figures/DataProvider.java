package by.gbyzzz.task04figures;

import by.gbyzzz.task04figures.beans.Point;
import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProvider {
    public static Type listType = new TypeToken<ArrayList<Pyramid>>(){}.getType();

    public static Pyramid pyramid = new Pyramid("Pyramid", 60.0, "x",
            Arrays.asList(new Point(0, 5, 7), new Point(0, 6, 4)));

    public static Pyramid pyramid1 = new Pyramid("Pyramid1", 80.0, "y",
            Arrays.asList(new Point(0.7, 5, 0.5), new Point(0.7, 5, 4.8)));

    public static Pyramid pyramid2 = new Pyramid("Pyramid2", 90.0, "x",
            Arrays.asList(new Point(30, 6, 0.5), new Point(30, 10, 4.8)));

    public static Pyramid pyramid3 = new Pyramid("Pyramid3", 50.0, "y",
            Arrays.asList(new Point(10, 8, 0.5), new Point(100, 8, 4.8)));

    public static Pyramid pyramid4 = new Pyramid("Pyramid4", 10.0, "z",
            Arrays.asList(new Point(80, -46, 0.5), new Point(-90, 45, 0.5)));

    public static Pyramid pyramid5 = new Pyramid("Pyramid5", 140.0, "z",
            Arrays.asList(new Point(5.3, 9, -6), new Point(41, -5, -6)));

    public static Pyramid pyramid8 = new Pyramid("Pyramid8", 110.0, "z",
            Arrays.asList(new Point(5.3, 9, -6), new Point(41, -5, -6)));


    public static List<Pyramid> pyramidListTrue = Arrays.asList( new Pyramid("Pyramid", 60.0, "x",
        Arrays.asList(new Point(0, 5, 7), new Point(0, 6, 4))),
        new Pyramid("Pyramid1", 80.0, "y",
                Arrays.asList(new Point(0.7, 5, 0.5), new Point(0.7, 5, 4.8))));
    public static List<Pyramid> pyramidListFalse = Arrays.asList( new Pyramid("Pyramid", 60.0, "x",
                    Arrays.asList(new Point(0, 9, 7), new Point(0, 6, 4))),
            new Pyramid("Pyramid1", 80.0, "y",
                    Arrays.asList(new Point(0.7, 4, 0.5), new Point(0.7, 5, 4.8))));




    public static Registrator pyramidReg = new Registrator(249.2, 100.0, 542.0, 1.0, true);

    public static Registrator pyramidReg1 = new Registrator(332.6, 246.5, 982.9, 1.0, true);

    public static List<Pyramid> findPyramidByAreaRange = Arrays.asList(pyramid2);
    public static List<Pyramid> findPyramidByName = Arrays.asList(pyramid1);
    public static List<Pyramid> findPyramidByParallelAxis = Arrays.asList(pyramid4, pyramid8, pyramid5);
    public static List<Pyramid> findPyramidByVolumeRange = Arrays.asList(pyramid, pyramid1, pyramid2);
    public static List<Pyramid> sortPyramidByArea = Arrays.asList(pyramid, pyramid1, pyramid2, pyramid8, pyramid5, pyramid3, pyramid4);
    public static List<Pyramid> sortPyramidByName = Arrays.asList(pyramid, pyramid1, pyramid2, pyramid3, pyramid4, pyramid5, pyramid8);
    public static List<Pyramid> sortPyramidByPerimeter = Arrays.asList(pyramid, pyramid1, pyramid2, pyramid8, pyramid3, pyramid5, pyramid4);
    public static List<Pyramid> sortPyramidByVolume = Arrays.asList(pyramid, pyramid1, pyramid2, pyramid8, pyramid5, pyramid4, pyramid3);
}
