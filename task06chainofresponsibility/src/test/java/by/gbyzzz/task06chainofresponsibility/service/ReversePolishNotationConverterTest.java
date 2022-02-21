package by.gbyzzz.task06chainofresponsibility.service;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ReversePolishNotationConverterTest {

    private ReversePolishNotationConverter converter;

    @BeforeClass
    public void setParam() {
        converter = new ReversePolishNotationConverter();
    }


    @DataProvider(name = "convert")
    public Object[][] convertData() {
        return
                new Object[][]{
                        {"5>>>7", "5 7 >>>"},
                        {"~6&9|(3&4)", "6 ~ 9 & 3 4 & |"},
                        {"(~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78", "71 ~ 2 3 & 3 2 1 2 >> & 2 | 2 & | | 10 2 & | & 78 |"},
                };
    }


    @Test(dataProvider = "convert")
    public void convertTest(String str, String expected) {
        str = converter.convert(str);
        assertEquals(str, expected);
    }
}