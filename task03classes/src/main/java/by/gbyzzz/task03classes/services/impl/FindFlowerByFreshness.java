package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.BouquetFindService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FindFlowerByFreshness implements BouquetFindService {
    @Override
    public List<Flowers> find(Bouquet bouquet, String ... str){
        List<Flowers> foundFlowers = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis()));
        calendar.add(Calendar.DATE, Integer.parseInt(str[0]) * (-1));
        for(Flowers flower : bouquet.getFlowers()) {
            if (calendar.getTime().before(flower.getCutDate())) {
                foundFlowers.add(flower);
            }
        }
        return foundFlowers;
    }
}
