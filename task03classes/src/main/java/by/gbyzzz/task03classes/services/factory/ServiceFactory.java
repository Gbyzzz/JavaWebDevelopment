package by.gbyzzz.task03classes.services.factory;


import by.gbyzzz.task03classes.services.*;
import by.gbyzzz.task03classes.services.impl.*;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private final MakeBouquetService makeBouquetByStemLength = new MakeBouquetByStemLength();
    private final MakeBouquetService makeBouquetByFlowerType = new MakeBouquetByFlowerType();
    private final MakeBouquetService makeBouquetByColor = new MakeBouquetByColor();
    private final BouquetSortService sortBouquetByCutDate = new SortBouquetByCutDate();
    private final BouquetFindService findFlowerByStemLength = new FindFlowerByStemLength();
    private final ParseJSONService parseJSON = new ParseJSON();
    private final ValidatorService validatorService = new ValidatorImpl();


    private ServiceFactory() { }
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public BouquetSortService getSortBouquetByCutDate() {
        return sortBouquetByCutDate;
    }

    public MakeBouquetService getMakeBouquetByStemLength() {
        return makeBouquetByStemLength;
    }
    public MakeBouquetService getMakeBouquetByFlowerType() {
        return makeBouquetByFlowerType;
    }
    public MakeBouquetService getMakeBouquetByColor() {
        return makeBouquetByColor;
    }

    public BouquetFindService getFindFlowerByStemLength() {
        return findFlowerByStemLength;
    }
    public ParseJSONService getParseJSON() {
        return parseJSON;
    }

    public ValidatorService getValidatorService() {return validatorService;
    }
}
