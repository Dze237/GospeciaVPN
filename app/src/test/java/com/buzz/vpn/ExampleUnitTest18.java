package com.buzz.vpn;

import org.json.JSONObject;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest18 {
    @Test
    public void jsonParsing_isCorrect() {
        String jsonString = "{\"name\":\"Alice\",\"age\":30}";
        JSONObject jsonObject = new JSONObject(jsonString);
        assertEquals("Alice", jsonObject.getString("name"));
        assertEquals(30, jsonObject.getInt("age"));
    }
}
