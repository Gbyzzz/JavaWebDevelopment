package by.gbyzzz.task04figures.repository;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import by.gbyzzz.task04figures.repository.specification.PyramidSpecification;
import by.gbyzzz.task04figures.repository.specification.find.FindPyramidSpecification;
import by.gbyzzz.task04figures.repository.specification.sort.SortPyramidSpecification;
import by.gbyzzz.task04figures.services.PyramidServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class PyramidRepository implements Repository<Pyramid> {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final PyramidRepository REPOSITORY = new PyramidRepository();

    public static PyramidRepository getRepository() {
        return REPOSITORY;
    }

    private PyramidServiceFactory pyramidService = PyramidServiceFactory.getInstance();

    private HashMap<Long, HashMap<Pyramid, Registrator>> storage = new HashMap<>();

    private static Long idCounter = Long.valueOf(0);

    private PyramidRepository() {
    }

    @Override
    public void createOrUpdate(final Pyramid pyramid) {
            HashMap<Pyramid, Registrator> pyrReg;
            Long foundId = findId(pyramid);
            if (foundId == null) {
                idCounter++;
                pyrReg = getPyrReg(pyramid);
                storage.put(idCounter, pyrReg);
                LOGGER.trace("Adding new pyramid with name " + pyramid.getName() + " to repository");
            } else {
                for (Pyramid pyr : storage.get(foundId).keySet()) {
                    if (!pyr.equals(pyramid)) {
                        storage.remove(foundId);
                        pyrReg = getPyrReg(pyramid);
                        LOGGER.trace("Updating information for pyramid with name " + pyramid.getName());
                        storage.put(foundId, pyrReg);
                    }
                }
            }
    }

    @Override
    public void remove(final Pyramid pyramid) {
        Long foundId = findId(pyramid);
        LOGGER.trace("Removing pyramid with name " + pyramid.getName() + " from repository");
        storage.remove(foundId);
    }

    @Override
    public HashMap read() {
        LOGGER.trace("Reading repository");
        HashMap<Long, HashMap<Pyramid, Registrator>> res = storage;
        return res;
    }

    @Override
    public List<Pyramid> query(final PyramidSpecification specification) {
        List<Pyramid> res = null;
        if (specification instanceof FindPyramidSpecification) {
            res = new ArrayList<>();

            for (Long id : storage.keySet()) {
                for (Pyramid pyramid : storage.get(id).keySet()) {
                    if (((FindPyramidSpecification) specification).isSpecified(storage.get(id))) {
                        res.add(pyramid);
                    }
                }
            }
        }
        if (specification instanceof SortPyramidSpecification) {
            res = new ArrayList<>();
            List<HashMap<Pyramid, Registrator>> arr = new ArrayList<>();

            for (Long id : storage.keySet()) {
                arr.add(storage.get(id));
            }
            arr.sort(((SortPyramidSpecification) specification).getComparator());

            for (HashMap<Pyramid, Registrator> arr1 : arr) {
                for (Pyramid pyramid : arr1.keySet()) {
                    res.add(pyramid);
                }
            }
        }
        return res;
    }

    private Long findId(final Pyramid pyramid) {
        LOGGER.trace("Looking for Id of pyramid with name " + pyramid.getName());
        Long foundId = null;
        for (Long id : storage.keySet()) {
            for (Pyramid pyr : storage.get(id).keySet()) {
                if (pyr.getName().equals(pyramid.getName())) {
                    foundId = id;
                }
            }
        }
        return foundId;
    }

    private HashMap<Pyramid, Registrator> getPyrReg(final Pyramid pyramid) {
        LOGGER.trace("Making subMap for pyramid with name " + pyramid.getName());
        HashMap<Pyramid, Registrator> pyrReg = new HashMap<>();
        Registrator registrator = new Registrator();
        LOGGER.trace("Making calculations of pyramid with name " + pyramid.getName());
        pyramidService.getPyramidCalculations().calc(pyramid, registrator);
        pyrReg.put(pyramid, registrator);
        return pyrReg;
    }

    @Override
    public String toString() {
        return "PyramidRepository{"
                + "storage=" + storage
                + '}';
    }

}
