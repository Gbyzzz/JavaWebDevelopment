package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;

import java.util.List;

public interface BouquetFindService {
    public List<Flowers> find(Bouquet bouquet, String ... str);
}
