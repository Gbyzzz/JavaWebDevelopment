package by.gbyzzz.task02javaarrays.dal;

public class FileIOFactory {
    private static final FileIOFactory INSTANCE = new FileIOFactory();
    private final FileIO fileIO = new FileIOImpl();

    private FileIOFactory() { }
    public static FileIOFactory getInstance() {
        return INSTANCE;
    }

    public FileIO getFileIO() {
        return fileIO;
    }

}
