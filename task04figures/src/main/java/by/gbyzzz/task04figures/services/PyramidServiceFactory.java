package by.gbyzzz.task04figures.services;

public final class PyramidServiceFactory {
    private static final PyramidServiceFactory INSTANCE = new PyramidServiceFactory();
    private final PyramidCalculations pyramidCalculations = new PyramidCalculationsImpl();
    private final PyramidValidator validator = new PyramidValidator();

    private PyramidServiceFactory() { }
    public static PyramidServiceFactory getInstance() {
        return INSTANCE;
    }

    public PyramidCalculations getPyramidCalculations() {
        return pyramidCalculations;
    }
    public PyramidValidator getPyramidValidator() {
        return validator;
    }


}
