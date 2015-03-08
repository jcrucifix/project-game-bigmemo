package jproject.game.android.bigmemo.ai;

import java.util.List;

/**
 * The color picker aims to select a color randomly.
 */
public class ColorPicker {

    public static Long pick(List<Long> colors) {
        Integer randomNumber = getRandomNumber();

        //Search for a random number lower than the size of the array.
        while (randomNumber > colors.size()) {
            randomNumber = getRandomNumber();
        }

        return colors.get(randomNumber);
    }

    private static Integer getRandomNumber() {
        //Returns a pseudo-random double n, where n >= 0.0 && n < 1.0.
        Integer randomNumber = Integer.parseInt(String.valueOf(Math.random()));
        //Multiply by ten to get a non decimal value between 0 and 9.
        randomNumber = randomNumber * 10;
        return randomNumber;
    }
}
