package by.gbyzzz.task03classes.services;

import java.util.List;

public interface FindService<T> {
    public List<T> find(List<T> flowers, String ... str);
}
