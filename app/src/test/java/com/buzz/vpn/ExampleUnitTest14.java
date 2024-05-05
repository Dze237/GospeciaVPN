package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest14 {
    @Test
    public void numberFormatting_isCorrect() {
        double value = 1234.5678;
        String formatted = String.format("%.2f", value);
        assertEquals("1234.57", formatted);
    }
}
