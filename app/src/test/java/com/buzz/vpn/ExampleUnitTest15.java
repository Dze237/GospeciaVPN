package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest15 {
    // Simple conversion method
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    @Test
    public void celsiusToFahrenheit_isCorrect() {
        double celsius = 0;
        double expectedFahrenheit = 32;
        assertEquals(expectedFahrenheit, celsiusToFahrenheit(celsius), 0.001);
    }
}
