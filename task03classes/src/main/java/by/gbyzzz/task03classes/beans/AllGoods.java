package by.gbyzzz.task03classes.beans;

import by.gbyzzz.task03classes.beans.flowers.Rose;
import java.util.List;

public class AllGoods <T extends Goods> {
    private String name;
    private List<T> goods;

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getGoods() {
        return goods;
    }

    public void setGoods(List<T> goods) {
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AllGoods{" +
                "name='" + name + '\'' +
                ", goods=" + goods +
                '}';
    }
}
