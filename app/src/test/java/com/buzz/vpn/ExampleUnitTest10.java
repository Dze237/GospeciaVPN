package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Test list size.
 */
public class ExampleUnitTest10 {
    @Test
    public void listSize_isCorrect() {
        List<String> items = new ArrayList<>();
        items.add("one");
        items.add("two");
        items.add("three");
        assertEquals("List size is incorrect", 3, items.size());
    }
}
