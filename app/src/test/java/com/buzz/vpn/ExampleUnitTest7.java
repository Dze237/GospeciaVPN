package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test that a value is not null.
 */
public class ExampleUnitTest7 {
    @Test
    public void notNullCheck_isCorrect() {
        Object obj = new Object();
        assertNotNull("Expected non-null object", obj);
    }
}
