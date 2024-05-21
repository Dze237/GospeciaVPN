package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest17 {
    @Test
    public void regexMatch_isCorrect() {
        String pattern = "^[A-Z][a-z]+\\s[A-Z][a-z]+$"; // Matches "Firstname Lastname"
        String name = "John Doe";
        assertTrue("Regex should match the name.", name.matches(pattern));
    }
}
