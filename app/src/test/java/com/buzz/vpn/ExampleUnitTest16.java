package com.buzz.vpn;

import org.junit.Test;

public class ExampleUnitTest16 {
    @Test(expected = NumberFormatException.class)
    public void invalidNumberFormat_throwsException() {
        // This should throw NumberFormatException
        Integer.parseInt("NotANumber");
    }
}
