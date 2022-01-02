package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Goods;

import java.lang.reflect.Type;
import java.util.List;

public interface FileIOInterface {
    public AllGoods parseJSON(String file, Type type);
}
