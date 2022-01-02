package by.gbyzzz.task03classes.services.factory;


import by.gbyzzz.task03classes.services.BouquetFindService;
import by.gbyzzz.task03classes.services.BouquetSortService;
import by.gbyzzz.task03classes.services.MakeBouquetService;
import by.gbyzzz.task03classes.services.impl.*;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private final MakeBouquetService makeBouquetByStemLength = new MakeBouquetByStemLength();
    private final MakeBouquetService makeBouquetByFlowerType = new MakeBouquetByFlowerType();
    private final MakeBouquetService makeBouquetByColor = new MakeBouquetByColor();
    private final BouquetSortService sortBouquetByCutDate = new SortBouquetByCutDate();
    private final BouquetSortService sortBouquetByPrice = new SortBouquetByPrice();
    private final BouquetSortService sortBouquetByStemLength = new SortBouquetByStemLength();
    private final BouquetFindService findFlowerByStemLength = new FindFlowerByStemLength();
    private final BouquetFindService findFlowerByPrice = new FindFlowerByPrice();
    private final BouquetFindService findFlowerByFreshness = new FindFlowerByFreshness();


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

    public BouquetFindService getFindFlowerByStemLength() {
        return findFlowerByStemLength;
    }
    public BouquetFindService getFindFlowerByPrice() {
        return findFlowerByPrice;
    }
    public BouquetFindService getFindFlowerByFreshness() {
        return findFlowerByFreshness;
    }
}
