package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Goods;

import java.lang.reflect.Type;
import java.util.List;

public interface FileIOInterface {
    void parseJSON(String file);
    void writeJSON(String file);
}
