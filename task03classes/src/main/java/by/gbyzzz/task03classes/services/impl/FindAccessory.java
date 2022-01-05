package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Goods;
import by.gbyzzz.task03classes.services.BouquetFindService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FindAccessory implements BouquetFindService {
    public List<Goods> find(List<Goods> accessories, String... str) {
        List<Goods> found = new ArrayList<>();
        for (Accessories accessory : AllGoods.getAllGoods().getAccessories()) {
            if (accessory.getName().toLowerCase(Locale.ROOT).equals(str[1].toLowerCase(Locale.ROOT)) &&
                    accessory.getColor().toLowerCase(Locale.ROOT).equals(str[2].toLowerCase(Locale.ROOT))) {
                if (found.size() < 1) {
                    found.add(accessory);
                }
            }
        }
        return found;
    }
}
