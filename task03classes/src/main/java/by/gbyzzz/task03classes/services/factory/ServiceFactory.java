package by.gbyzzz.task03classes.services.factory;


import by.gbyzzz.task03classes.services.BouquetSortService;
import by.gbyzzz.task03classes.services.MakeBouquetService;
import by.gbyzzz.task03classes.services.impl.*;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private final MakeBouquetService makeBouquetByStemLength = new MakeBouquetByStemLengthImpl();
    private final MakeBouquetService makeBouquetByFlowerType = new MakeBouquetByFlowerTypeImpl();
    private final MakeBouquetService makeBouquetByColor = new MakeBouquetByColorImpl();
    private final BouquetSortService sortBouquetByCutDate = new SortBouquetByCutDateImplSort();
    private final BouquetSortService sortBouquetByPrice = new SortBouquetByPriceImplSort();
    private final BouquetSortService sortBouquetByStemLength = new SortBouquetByStemLengthImplSort();

    private ServiceFactory() { }
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public BouquetSortService getSortBouquetByCutDate() {
        return sortBouquetByCutDate;
    }
    public BouquetSortService getSortBouquetByPrice() {
        return sortBouquetByPrice;
    }
    public BouquetSortService getSortBouquetByStemLength() {
        return sortBouquetByStemLength;
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

}
