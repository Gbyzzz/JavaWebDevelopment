package by.gbyzzz.task04figures.dal.repository;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.dal.repository.specification.PyramidSpecification;
import by.gbyzzz.task04figures.dal.repository.specification.find.FindPyramidByName;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PyramidRepository implements Repository <Pyramid>{
    private static final PyramidRepository repository = new PyramidRepository();

    public static PyramidRepository getRepository(){
        return repository;
    }

    private HashMap<Integer, Pyramid> storage = new HashMap<>();

    static Integer idCounter = 0;

    private PyramidRepository(){
    }

    @Override
    public void createOrUpdate(Pyramid pyramid) {
        for(Integer key : storage.keySet()){
            if(storage.get(key).getName().equals(pyramid.getName())){ //TODO не работает тут
                storage.put(key, pyramid);
            }
        }
        idCounter++;
        storage.put(idCounter, pyramid);

    }

    @Override
    public void remove(Pyramid pyramid) {
        for(Integer key : storage.keySet()){
            if(storage.get(key).getName().equals(pyramid.getName())){
                storage.remove(key);
            }
        }

    }

    @Override
    public HashMap read() {
       HashMap<Integer, Pyramid> res = storage;
       return res;
    }

    @Override
    public List<Pyramid> query(PyramidSpecification specification) {
        return null;
    }

    @Override
    public String toString() {
        return "PyramidRepository{" +
                "storage=" + storage +
                '}';
    }

    //    public static void createOrUpdate (Figure figure) {
//        if(figure instanceof Pyramid){
//            Pyramid pyramid = (Pyramid) figure;
//            PyramidStorage.getPyramidStorage().addEl(pyramid);
//        }else{
//
//        }
//    }

//    public static void update (Figure figure, Registrator registrator) {
//        if(figure instanceof Pyramid){
//            Pyramid pyramid = (Pyramid) figure;
//            PyramidStorage.getPyramidStorage().updateEl(pyramid,registrator);
//        }else{
//
//        }
//    }

//    public static void remove (Figure figure, Registrator registrator) {
//        if(figure instanceof Pyramid){
//            Pyramid pyramid = (Pyramid) figure;
//            PyramidStorage.getPyramidStorage().removeEl(pyramid);
//        }else{
//
//        }
//
//    }
//
//    public static List<Pyramid> query(final PyramidSpecification specification){
//        List<Pyramid> res = null;
//        if(specification instanceof FindPyramidSpecification){
//            res = new ArrayList<>();
//
//            for(Map.Entry entry : PyramidStorage.getPyramidStorage().getPyramidList()){
//                if(((FindPyramidSpecification) specification).isSpecified(entry)){
//                    res.add((Pyramid) entry.getKey());
//                }
//            }
//        }
//        if(specification instanceof SortPyramidSpecification){
//            res = new ArrayList<>();
//
//            for(Map.Entry entry : PyramidStorage.getPyramidStorage().getPyramidList()){
//
//                    res.add((Pyramid) entry.getKey());
//            }
//            res.sort(((SortPyramidSpecification) specification).getComparator());
//        }
//        return res;
//    }
}
