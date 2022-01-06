package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.ValidateFlowersService;

import java.util.List;

public class ValidateFlowers implements ValidateFlowersService {
    public void validate(List<Flowers> flowers){
        for(int i = 0; i< flowers.size(); ++i){
            if(flowers.get(i).getStemLength() < 0){
                flowers.remove(flowers.get(i));
            }
        }
    }
}
