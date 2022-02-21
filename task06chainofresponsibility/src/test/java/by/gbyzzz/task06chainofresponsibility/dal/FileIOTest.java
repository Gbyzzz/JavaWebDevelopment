package by.gbyzzz.task06chainofresponsibility.dal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileIOTest {
    FileIOFactory fileIO;

    @BeforeClass
    public void setParam() {
        fileIO = FileIOFactory.getInstance();
    }


    @DataProvider(name = "read_file")
    public Object[][] readFileData() {
        return
                new Object[][]{
                        {"test1.txt", "Разобранный текст должен быть представлен в виде объекта," +
                                " содержащего, например, абзацы, предложения, лексемы, слова, выражения," +
                                " символы. Лексема – часть текста, ограниченная пробельными символами. Для " +
                                "организации структуры данных использовать Composite."},
                        {"test2.txt", "Классы с информацией являются классами сущностей и не должны" +
                                " быть перенагружены методами логики."},
                        {"test3.txt", "Cоздать приложение, разбирающее текст из файла и позволяющее выполнять" +
                                " с текстом три различных операции + (ОПЕРАЦИЯ 0!)."},
                };
    }


    @Test(dataProvider = "read_file")
    public void readFileTest(String str, String expected) {
        String actual = fileIO.getFileIO().readText(str);
       assertEquals(actual, expected);
    }
}