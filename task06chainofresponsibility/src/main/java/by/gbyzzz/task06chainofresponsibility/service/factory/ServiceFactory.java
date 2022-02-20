package by.gbyzzz.task06chainofresponsibility.service.factory;

import by.gbyzzz.task06chainofresponsibility.service.Service;
import by.gbyzzz.task06chainofresponsibility.service.interpreter.ExpressionCalculator;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private final Service calculator = new ExpressionCalculator();



    private ServiceFactory() { }
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public Service getCalculator() { return calculator; }

}
