package by.gbyzzz.task05multithreading.view.factory;


import by.gbyzzz.task05multithreading.view.IOData;
import by.gbyzzz.task05multithreading.view.impl.IODataImpl;

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
