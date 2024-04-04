package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 * Test array equality.
 */
public class ExampleUnitTest9 {
    @Test
    public void arrayEquality_isCorrect() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals("Arrays are not equal", expected, actual);
    }
}
