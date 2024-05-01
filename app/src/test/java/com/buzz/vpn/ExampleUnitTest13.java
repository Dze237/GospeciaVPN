package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest12 {
    @Test
    public void stringLength_isCorrect() {
        String text = "Open Source";
        int expectedLength = 11; // "Open Source" has 11 characters (including the space)
        assertEquals("String length is incorrect.", expectedLength, text.length());
    }
}
