package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class ExampleUnitTest29 {
    // Generates a random number between min (inclusive) and max (exclusive)
    public int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    @Test
    public void randomNumber_isWithinRange() {
        int min = 10;
        int max = 20;
        int randomNum = getRandomNumber(min, max);
        assertTrue("Random number is below the minimum", randomNum >= min);
        assertTrue("Random number is above or equal to maximum", randomNum < max);
    }
}
