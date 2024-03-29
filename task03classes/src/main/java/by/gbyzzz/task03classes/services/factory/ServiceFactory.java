package by.gbyzzz.task03classes.services.factory;


import by.gbyzzz.task03classes.services.*;
import by.gbyzzz.task03classes.services.impl.*;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final SortService sortBouquetByCutDate = new SortFlowersByCutData();
    private final FindService findFlowerByStemLength = new FindFlowerByStemLength();
    private final FindService findFlowerByColor = new FindFlowerByColor();
    private final FindService findFlowerByType = new FindFlowerByType();
    private final FindService findAccessory = new FindAccessory();
    private final JSONService parseJSON = new JSON();
    private final JSONService writeJSON = new WriteToJSON();
    private final ValidatorService validatorService = new ValidatorImpl();
    private final DataGeneratorService dataGeneratorService = new GenerateData();
    private final ValidateFlowersService validateFlowersService = new ValidateFlowers();
    private final GetPriceService getFlowersTotalPrice = new GetFlowersTotalPrice();
    private final GetPriceService getAccessoriesTotalPrice = new GetAccessoriesTotalPrice();


    private ServiceFactory() { }
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public SortService getSortBouquetByCutDate() {
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

    public ValidateFlowersService getValidateFlowersService(){return validateFlowersService;}

    public GetPriceService getFlowersTotalPrice(){return getFlowersTotalPrice;}
    public GetPriceService getAccessoriesTotalPrice(){return getAccessoriesTotalPrice;}
}
