package by.gbyzzz.task02javaarrays.view.factory;

import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.impl.IODataImpl;

public final class ViewFactory {
    private static final ViewFactory INSTANCE = new ViewFactory();
    private final IOData ioData = new IODataImpl();
    private ViewFactory() { }
    public static ViewFactory getInstance() {
        return INSTANCE;
    }

    public IOData getIoData() {
        return ioData;
    }
}
