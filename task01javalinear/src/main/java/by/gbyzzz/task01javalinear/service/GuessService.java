package by.gbyzzz.task01javalinear.service;

import by.gbyzzz.task01javalinear.entity.Data;

public class GuessService {

    private Data rightGuess = new Data();
    private Data wrongGuess = new Data();
    private Data notGuessed = new Data();
    private Data rand = new Data();

    public int random (int max) {
        return (int) (Math.random() * max);
    }

    public int rightGuess(int guess, Data rand) {
            if (rand.contains(guess)) {
                return 1;
            } else {
                return 0;
            }
        }

    public int notGuessed(int rand, Data guess) {
            if (!guess.contains(rand)) {
            return 1;
            }
            return 0;
        }
}