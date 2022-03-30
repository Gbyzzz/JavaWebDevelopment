package by.gbyzzz.task07webxmlparsing.entity.repository;

import by.gbyzzz.task07webxmlparsing.entity.User;

import java.util.HashMap;

public interface Repository<T extends User> {

    void createOrUpdate(T t);

    void remove(T t);

    HashMap<Long, T> read();
}
