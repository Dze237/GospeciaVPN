package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ExampleUnitTest23 {
    // Utility method to find the minimum element in a list
    public int findMin(List<Integer> list) {
        return Collections.min(list);
    }

    @Test
    public void minElement_isCorrect() {
        List<Integer> numbers = Arrays.asList(42, 17, 93, 8, 56);
        assertEquals("Minimum element not found", 8, findMin(numbers));
    }
}
