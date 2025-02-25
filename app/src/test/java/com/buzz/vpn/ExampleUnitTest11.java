package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ExampleUnitTest11 {
    @Test
    public void arraySorting_isCorrect() {
        int[] unsorted = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        Arrays.sort(unsorted);
        assertArrayEquals("The array was not sorted correctly.", expected, unsorted);
    }
}
