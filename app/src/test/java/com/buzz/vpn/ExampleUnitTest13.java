package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest13 {
    @Test
    public void objectEquality_isCorrect() {
        String a = new String("Test");
        String b = new String("Test");
        assertTrue("Strings should be equal.", a.equals(b));
    }
}
