package by.gbyzzz.task03classes.dal;

import by.gbyzzz.task03classes.beans.Goods;

import java.lang.reflect.Type;
import java.util.List;

public interface FileIOInterface {
    public List<? extends Goods> parseJSON(String file, List<? extends Goods> obj, Type type);
}
