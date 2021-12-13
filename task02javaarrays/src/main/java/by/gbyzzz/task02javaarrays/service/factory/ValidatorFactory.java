package by.gbyzzz.task02javaarrays.service.factory;

import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.impl.ValidatorImpl;
import by.gbyzzz.task02javaarrays.view.IOData;

public class ValidatorFactory {
    private static final ValidatorFactory instance = new ValidatorFactory();
    private final ValidatorService validatorService = new ValidatorImpl();
    private ValidatorFactory(){}
    public static ValidatorFactory getInstance(){
        return instance;
    }

    public ValidatorService getValidatorService() {
        return validatorService;
    }
}
