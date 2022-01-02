package by.gbyzzz.task03classes.beans;

import java.util.List;

public class AllGoods {
    private static AllGoods INSTANCE = new AllGoods();
    private String name;
    private List<Flowers> flowers;
    private List<Accessories> accessories;

    public static AllGoods getInstance() {
        return INSTANCE;
    }
    public static void setInstance(AllGoods allGoods) {
        INSTANCE = allGoods;
    }

    public List<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flowers> flowers) {
        this.flowers = flowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Accessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessories> accessories) {
        this.accessories = accessories;
    }



    @Override
    public String toString() {
        return "AllGoods{" +
                "name: " + name + '\'' +
                ", flowers: " + flowers + ", \n" +
                "accessories: " + accessories +
                '}';
    }
}
