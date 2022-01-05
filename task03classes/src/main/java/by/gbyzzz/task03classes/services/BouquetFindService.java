package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.beans.Goods;

import java.util.List;

public interface BouquetFindService {
    public List<Goods> find(List<Goods> flowers, String ... str);
}
