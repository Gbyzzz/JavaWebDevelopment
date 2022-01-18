package by.gbyzzz.task04figures.controller;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.dal.fileio.FileIOFactory;
import by.gbyzzz.task04figures.dal.repository.PyramidRepository;
import by.gbyzzz.task04figures.dal.repository.Repository;
import by.gbyzzz.task04figures.services.PyramidValidator;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        Repository pyramidRepository = PyramidRepository.getRepository();
        PyramidValidator pyramidValidator = new PyramidValidator();
        Type listType = new TypeToken<ArrayList<Pyramid>>(){}.getType();

        List<Pyramid> pyramidList = fileIOFactory.getFileIO().parseJSON("pyramid.json", listType);
        for(Pyramid pyramid : pyramidList){
            if(pyramidValidator.validate(pyramid)){
                pyramidRepository.createOrUpdate(pyramid);
            }
        }
        System.out.println(pyramidRepository);

        pyramidList = fileIOFactory.getFileIO().parseJSON("pyramid1.json", listType);
        for(Pyramid pyramid : pyramidList){
            if(pyramidValidator.validate(pyramid)){
                pyramidRepository.createOrUpdate(pyramid);
            }
        }
        System.out.println(pyramidRepository);

    }
}
