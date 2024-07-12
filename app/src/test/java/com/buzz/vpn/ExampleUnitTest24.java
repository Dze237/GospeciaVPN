package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest24 {
    // Basic binary search: returns index of target or -1 if not found.
    public int binarySearch(int[] sortedArr, int target) {
        int low = 0, high = sortedArr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArr[mid] == target) {
                return mid;
            } else if (sortedArr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    @Test
    public void binarySearch_isCorrect() {
        int[] sorted = {1, 3, 5, 7, 9};
        assertEquals("Binary search did not find target", 2, binarySearch(sorted, 5));
        assertEquals("Binary search should return -1 for missing element", -1, binarySearch(sorted, 6));
    }
}
