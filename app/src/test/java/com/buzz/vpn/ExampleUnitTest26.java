package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleUnitTest26 {
    @Test
    public void streamSorting_isCorrect() {
        List<Integer> unsorted = Arrays.asList(10, 5, 8, 1, 7);
        List<Integer> sorted = unsorted.stream()
                                       .sorted()
                                       .collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(1, 5, 7, 8, 10);
        assertEquals("Stream sorting failed", expected, sorted);
    }
}
