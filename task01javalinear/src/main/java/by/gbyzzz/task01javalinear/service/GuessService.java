package by.gbyzzz.task01javalinear.service;

import by.gbyzzz.task01javalinear.entity.Data;

/**
 * This class has methods to perform guess game task.
 * @author Anton Pinchuk
 *
 */

import java.util.Random;

public final class GuessService {

    private Random rand = new Random();

    public int random(final int max) {
        return rand.nextInt(max);
    }

    public int rightGuess(final int guess, final Data rand) {
            if (rand.contains(guess)) {
                return 1;
            } else {
                return 0;
            }
        }

    public int notGuessed(final int rand, final Data guess) {
            if (!guess.contains(rand)) {
            return 1;
            }
            return 0;
        }
}