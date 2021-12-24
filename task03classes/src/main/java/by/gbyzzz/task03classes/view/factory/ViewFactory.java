package by.gbyzzz.task03classes.view.factory;

import by.gbyzzz.task03classes.view.IOData;
import by.gbyzzz.task03classes.view.impl.IODataImpl;

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
