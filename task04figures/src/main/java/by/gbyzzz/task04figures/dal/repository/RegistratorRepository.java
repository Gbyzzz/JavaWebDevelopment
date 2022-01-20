package by.gbyzzz.task04figures.dal.repository;

import by.gbyzzz.task04figures.beans.Figure;
import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.registrator.Registrator;
import by.gbyzzz.task04figures.dal.repository.specification.PyramidSpecification;

import java.util.HashMap;
import java.util.List;

public class RegistratorRepository implements Repository {
    private static final RegistratorRepository registratorRepository = new RegistratorRepository();

    public static RegistratorRepository getRepository(){
        return registratorRepository;
    }

    private HashMap<String, Registrator> storage = new HashMap<>();

    @Override
    public void createOrUpdate(Figure figure) {
        Registrator registrator = new Registrator();
        if (figure instanceof Pyramid) {
            Pyramid pyramid = (Pyramid) figure;
           storage.put(pyramid.getName(), registrator);
        }
    }

    @Override
    public void remove(Figure figure) {

    }

    @Override
    public HashMap read() {
        return null;
    }

    @Override
    public List query(PyramidSpecification specification) {
        return null;
    }
}
