package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest21 {
    // Utility method to reverse a string
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Test
    public void reverseString_isCorrect() {
        String original = "OpenSource";
        String expected = "ecruosepO";
        assertEquals("String reversal failed", expected, reverse(original));
    }
}
