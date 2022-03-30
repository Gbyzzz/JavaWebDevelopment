package by.gbyzzz.task07webxmlparsing.entity.repository;

import by.gbyzzz.task07webxmlparsing.entity.Users;

import java.util.HashMap;

public interface Repository<T extends Users> {

    void createOrUpdate(T t);

    void remove(T t);

    HashMap<Long, T> read();
}
