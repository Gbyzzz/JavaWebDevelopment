package test.task03classes;

import by.gbyzzz.task03classes.beans.Flowers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DataProvider {
    static List<Flowers> list = Arrays.asList(new Flowers("rose","yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("tulip","red", BigDecimal.valueOf(2), 50, new Date(2022, 1, 6)),
            new Flowers("rose","red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 6)));

    static List<Flowers> foundTypeList = Arrays.asList(new Flowers("rose","yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("rose","red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 6)));

    static List<Flowers> foundColorList = Arrays.asList(new Flowers("tulip","red", BigDecimal.valueOf(2), 50, new Date(2022, 1, 6)),
            new Flowers("rose","red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 6)));

    static List<Flowers> foundStemLengthList = Arrays.asList(new Flowers("rose","yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)));
}
