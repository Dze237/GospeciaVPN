package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest28 {
    // Method to simulate a delay and return elapsed time in seconds.
    public double simulateDelayAndMeasure() {
        long start = System.nanoTime();
        // Simulate delay
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Ignore interruption for testing
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000_000.0;
    }

    @Test
    public void elapsedTime_isReasonable() {
        double elapsedSeconds = simulateDelayAndMeasure();
        // Expecting roughly 0.1 seconds with some margin
        assertTrue("Elapsed time is too short", elapsedSeconds >= 0.09);
        assertTrue("Elapsed time is too long", elapsedSeconds <= 0.2);
    }
}
