package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.services.FindService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FindAccessory implements FindService<Accessories> {
    public List<Accessories> find(List<Accessories> accessories, String... str) {
        List<Accessories> found = new ArrayList<>();
        for (Accessories accessory : AllGoods.getAllGoods().getAccessories()) {
            if (accessory.getName().toLowerCase(Locale.ROOT).equals(str[0].toLowerCase(Locale.ROOT)) &&
                    accessory.getColor().toLowerCase(Locale.ROOT).equals(str[1].toLowerCase(Locale.ROOT))) {
                if (found.size() < 1) {
                    found.add(accessory);
                }
            }
        }
        return found;
    }
}
