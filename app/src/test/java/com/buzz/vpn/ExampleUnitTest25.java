package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest25 {
    // Recursive Fibonacci method
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Test
    public void fibonacci_isCorrect() {
        assertEquals("Fibonacci for 0", 0, fibonacci(0));
        assertEquals("Fibonacci for 1", 1, fibonacci(1));
        assertEquals("Fibonacci for 2", 1, fibonacci(2));
        assertEquals("Fibonacci for 3", 2, fibonacci(3));
        assertEquals("Fibonacci for 5", 5, fibonacci(5));
    }
}
