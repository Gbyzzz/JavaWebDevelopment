package by.gbyzzz.task02javaarrays.dal;

public class FileIOFactory {
    private static final FileIOFactory instance = new FileIOFactory();
    private final FileIO fileIO = new FileIOImpl();

    private FileIOFactory(){}
    public static FileIOFactory getInstance(){
        return instance;
    }

    public FileIO getFileIO() {
        return fileIO;
    }

}
