package com.buzz.vpn;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class ExampleUnitTest27 {
    // Merge two maps; in case of duplicate keys, values from map2 override map1.
    public Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>(map1);
        merged.putAll(map2);
        return merged;
    }

    @Test
    public void mergeMaps_isCorrect() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 4);

        Map<String, Integer> merged = mergeMaps(map1, map2);
        assertEquals("Merged map size incorrect", 3, merged.size());
        assertEquals("Value for key 'a' incorrect", Integer.valueOf(1), merged.get("a"));
        assertEquals("Value for key 'b' incorrect", Integer.valueOf(3), merged.get("b"));
        assertEquals("Value for key 'c' incorrect", Integer.valueOf(4), merged.get("c"));
    }
}
