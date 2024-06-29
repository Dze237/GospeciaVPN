package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest22 {
    // Utility method to find the maximum element in an array
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Test
    public void maxElement_isCorrect() {
        int[] numbers = {5, 3, 9, 1, 7};
        assertEquals("Maximum element not found", 9, findMax(numbers));
    }
}
