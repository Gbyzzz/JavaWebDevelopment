package by.gbyzzz.task02javaarrays.service.factory;

import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.impl.ValidatorImpl;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private final ValidatorService validatorService = new ValidatorImpl();

    private ServiceFactory() { }
    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public ValidatorService getValidatorService() {
        return validatorService;
    }
}
