package by.gbyzzz.task03classes.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contain all objects of flowers and accessories.
 * @author Anton Pinchuk
 *
 */

public class AllGoods {

    /**
     * This object contains objects parsed from JSON file.
     */

    private static AllGoods allGoods = new AllGoods();

    /**
     * This object contains objects generated in service and should be written to JSON file.
     */

    private static AllGoods generator = new AllGoods();
    protected String name;
    protected List<Flowers> flowers = new ArrayList<>();
    protected List<Accessories> accessories = new ArrayList<>();

    public static AllGoods getAllGoods() {
        return allGoods;
    }
    public static void setAllGoods(final AllGoods allGoods) {
        AllGoods.allGoods = allGoods;
    }

    public static AllGoods getGenerator() {
        return generator;
    }
    public static void setGenerator(final AllGoods allGoods) {
        AllGoods.generator = allGoods;
    }

    public List<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(final List<Flowers> flowers) {
        this.flowers = flowers;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Accessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(final List<Accessories> accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "AllGoods{" + "name: " + name + '\''
                + ", flowers: " + flowers + ", \n"
                + "accessories: " + accessories + '}';
    }
}
