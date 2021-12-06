package test.gbyzzz.task01javalinear.partthree;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GuessService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GuessTest {
    GuessService gs = new GuessService();
    Data data = new Data();

    @DataProvider(name = "right_guess")
    public Object[][] RightGuessData() {
        return
                new Object[][]{
                        {4, new int[]{6, 7, 1, 4, 3}, 1},
                        {8, new int[]{6, 7, 1, 4, 3}, 0},
                        {9, new int[]{6, 7, 1, 4, 3}, 0},
                        {3, new int[]{6, 7, 1, 4, 3}, 1},
                };
    }


    @Test(dataProvider = "right_guess")
    public void RightGuessTest(int guess, int arg[], int expected) {

        double actual = gs.rightGuess(guess, new Data(arg));
        assertEquals(actual, expected);
    }

    @DataProvider(name = "not_guessed")
    public Object[][] NotGuessedData() {
        return
                new Object[][]{
                        {4, new int[]{6, 7, 1, 4, 3}, 0},
                        {8, new int[]{6, 7, 1, 4, 3}, 1},
                        {9, new int[]{6, 7, 1, 4, 3}, 1},
                        {3, new int[]{6, 7, 1, 4, 3}, 0},
                };
    }

    @Test(dataProvider = "not_guessed")
    public void notGuessedTest(int guess, int arg[], int expected) {
        double actual = gs.notGuessed(guess, new Data(arg));
        assertEquals(actual, expected);
    }
}
