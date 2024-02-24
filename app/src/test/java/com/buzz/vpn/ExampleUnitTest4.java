package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test string concatenation.
 */
public class ExampleUnitTest4 {
    @Test
    public void stringConcatenation_isCorrect() {
        String hello = "Hello, ";
        String world = "World!";
        assertEquals("String concatenation failed", "Hello, World!", hello + world);
    }
}
