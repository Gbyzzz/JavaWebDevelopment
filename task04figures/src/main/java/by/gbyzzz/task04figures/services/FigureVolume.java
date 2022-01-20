package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.registrator.Registrator;

public class FigureVolume implements PyramidCalculations {
    @Override
    public void calc(Pyramid pyramid, Registrator registrator) {
        registrator.setVolume((registrator.getBaseSide() * registrator.getBaseSide() * pyramid.getHeight())/3);
    }
}
