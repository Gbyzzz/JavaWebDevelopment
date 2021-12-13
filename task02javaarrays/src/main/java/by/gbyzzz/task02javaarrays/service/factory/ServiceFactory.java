package by.gbyzzz.task02javaarrays.service.factory;

import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.impl.ArrayServiceImpl;
import by.gbyzzz.task02javaarrays.service.impl.BubbleSort;
import by.gbyzzz.task02javaarrays.service.impl.MatrixServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ArrayService arrayService = new BubbleSort();
    private final ArrayService matrixServiceImpl = new MatrixServiceImpl();
    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        return instance;
    }


}
