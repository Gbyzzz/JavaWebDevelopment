package test.task03classes;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.Flowers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DataProvider {
    static List<Flowers> flowersList1 = Arrays.asList(new Flowers("rose", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("tulip", "red", BigDecimal.valueOf(2), 50, new Date(2022, 1, 5)),
            new Flowers("rose", "red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 7)));

    static List<Flowers> foundFlowersTypeList1 = Arrays.asList(new Flowers("rose", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("rose", "red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 7)));

    static List<Flowers> foundFlowersColorList1 = Arrays.asList(new Flowers("tulip", "red", BigDecimal.valueOf(2), 50, new Date(2022, 1, 5)),
            new Flowers("rose", "red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 7)));

    static List<Flowers> foundFlowersStemLengthList1 = Arrays.asList(new Flowers("rose", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)));

    static List<Flowers> sortedFlowersList1 = Arrays.asList(new Flowers("tulip", "red", BigDecimal.valueOf(2), 50, new Date(2022, 1, 5)),
            new Flowers("rose", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("rose", "red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 7)));

    static List<Flowers> flowersList2 = Arrays.asList(new Flowers("alstroemeria", "pink", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("tulip", "yellow", BigDecimal.valueOf(2), 50, new Date(2022, 1, 4)),
            new Flowers("rose", "red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 2)),
            new Flowers("alstroemeria", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 7)));

    static List<Flowers> foundFlowersTypeList2 = Arrays.asList(new Flowers("alstroemeria", "pink", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("alstroemeria", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 7)));

    static List<Flowers> foundFlowersColorList2 = Arrays.asList( new Flowers("tulip", "yellow", BigDecimal.valueOf(2), 50, new Date(2022, 1, 4)),
            new Flowers("alstroemeria", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 7)));

    static List<Flowers> foundFlowersStemLengthList2 = Arrays.asList(new Flowers("rose", "red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 2)));


    static List<Flowers> sortedFlowersList2 = Arrays.asList(new Flowers("rose", "red", BigDecimal.valueOf(2), 60, new Date(2022, 1, 2)),
            new Flowers("tulip", "yellow", BigDecimal.valueOf(2), 50, new Date(2022, 1, 4)),
            new Flowers("alstroemeria", "pink", BigDecimal.valueOf(2), 40, new Date(2022, 1, 6)),
            new Flowers("alstroemeria", "yellow", BigDecimal.valueOf(2), 40, new Date(2022, 1, 7)));


    static List<Accessories> accessoriesList1 = Arrays.asList(new Accessories("ribbon", BigDecimal.valueOf(1.5), "red"),
            new Accessories("box", BigDecimal.valueOf(1.5), "red"),
            new Accessories("ribbon", BigDecimal.valueOf(1.5), "yellow"),
            new Accessories("paper", BigDecimal.valueOf(1.5), "red"),
            new Accessories("ribbon", BigDecimal.valueOf(1.5), "red"));
    static List<Accessories> foundAccessory1 = Arrays.asList(new Accessories("ribbon", BigDecimal.valueOf(1.5), "red"));
}