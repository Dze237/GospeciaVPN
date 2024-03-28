package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test floating point comparison with delta.
 */
public class ExampleUnitTest8 {
    @Test
    public void floatingPointComparison_isCorrect() {
        double expected = 3.14;
        double actual = 22 / 7.0;
        assertEquals("Floating point comparison failed", expected, actual, 0.01);
    }
}
