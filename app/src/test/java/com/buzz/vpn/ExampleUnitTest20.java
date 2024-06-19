package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest20 {
    // Recursive factorial method
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
    
    @Test
    public void factorial_isCorrect() {
        assertEquals(1, factorial(0));
        assertEquals(1, factorial(1));
        assertEquals(2, factorial(2));
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(120, factorial(5));
    }
}
