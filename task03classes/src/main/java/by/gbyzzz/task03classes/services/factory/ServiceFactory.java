package by.gbyzzz.task03classes.services.factory;


import by.gbyzzz.task03classes.services.*;
import by.gbyzzz.task03classes.services.impl.*;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final BouquetSortService sortBouquetByCutDate = new SortBouquetByCutData();
    private final FindService findFlowerByStemLength = new FindFlowerByStemLength();
    private final FindService findFlowerByColor = new FindFlowerByColor();
    private final FindService findFlowerByType = new FindFlowerByType();
    private final FindService findAccessory = new FindAccessory();
    private final JSONService parseJSON = new JSON();
    private final JSONService writeJSON = new WriteToJSON();
    private final ValidatorService validatorService = new ValidatorImpl();
    private final DataGeneratorService dataGeneratorService = new GenerateData();


    private ServiceFactory() { }
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public BouquetSortService getSortBouquetByCutDate() {
        return sortBouquetByCutDate;
    }

    public FindService getFindFlowerByStemLength() {
        return findFlowerByStemLength;
    }
    public FindService getFindFlowerByColor() {
        return findFlowerByColor;
    }
    public FindService getFindFlowerByType() {
        return findFlowerByType;
    }
    public FindService getFindAccessory() {
        return findAccessory;
    }


    public JSONService getParseJSON() {
        return parseJSON;
    }
    public JSONService getWriteJSON() {
        return writeJSON;
    }


    public ValidatorService getValidatorService() {return validatorService;}

    public DataGeneratorService getDateGeneratorService(){return dataGeneratorService;}
}
