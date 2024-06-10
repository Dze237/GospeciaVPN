package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

// Custom exception for testing
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExampleUnitTest19 {
    // Method that always throws a CustomException
    public void throwException() throws CustomException {
        throw new CustomException("This is a test exception.");
    }
    
    @Test(expected = CustomException.class)
    public void customException_isThrown() throws CustomException {
        throwException();
    }
}
