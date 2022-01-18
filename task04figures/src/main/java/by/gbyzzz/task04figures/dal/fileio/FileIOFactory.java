package by.gbyzzz.task04figures.dal.fileio;

public class FileIOFactory {
    private static final FileIOFactory INSTANCE = new FileIOFactory();
    private final FileIOImpl fileIOImpl = new FileIOImpl();

    private FileIOFactory() { }
    public static FileIOFactory getInstance() {
        return INSTANCE;
    }

    public FileIOImpl getFileIO() {
        return fileIOImpl;
    }

}
