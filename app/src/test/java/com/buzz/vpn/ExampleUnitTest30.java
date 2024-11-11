package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest30 {
    // Method to check if a string is a palindrome (ignoring case and spaces)
    public boolean isPalindrome(String input) {
        String sanitized = input.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(sanitized).reverse().toString().equals(sanitized);
    }

    @Test
    public void palindromeCheck_isCorrect() {
        assertTrue("Should be a palindrome", isPalindrome("Race car"));
        assertFalse("Should not be a palindrome", isPalindrome("Open Source"));
    }
}
