package by.gbyzzz.task02javaarrays.service.factory;

import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.impl.FileIOServiceImpl;
import by.gbyzzz.task02javaarrays.service.impl.ValidatorImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ValidatorService validatorService = new ValidatorImpl();
    private final FileIOService fileIOService = new FileIOServiceImpl();
    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        return instance;
    }

    public ValidatorService getValidatorService() {
        return validatorService;
    }
    public FileIOService getFileIOService() {
        return fileIOService;
    }
}
