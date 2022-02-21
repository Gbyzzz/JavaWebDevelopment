package by.gbyzzz.task06chainofresponsibility.service.interpreter;

import by.gbyzzz.task06chainofresponsibility.service.ReversePolishNotationConverter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExpressionCalculatorTest {
    private ReversePolishNotationConverter converter;
    private ExpressionCalculator calculator;

    @BeforeClass
    public void setParam() {
        converter = new ReversePolishNotationConverter();
        calculator = new ExpressionCalculator();
    }

    @DataProvider(name = "calculate")
    public Object[][] calculateData() {
        return
                new Object[][]{
                        {"5>>>7", "0"},
                        {"~6&9|(3&4)", "9"},
                        {"(~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78", "78"},
                };
    }


    @Test(dataProvider = "calculate")
    public void calculateTest(String str, String expected) {
        str = calculator.calculate(converter.convert(str));
        assertEquals(str, expected);
    }

}