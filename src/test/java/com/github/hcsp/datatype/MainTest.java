package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void testStringAdd() {
        assertEquals("579", Main.add("123", "456"));
        assertEquals("0", Main.add("123", "-123"));
        assertEquals("123", Main.add("123", null));
        assertEquals("0", Main.add(null, null));
    }
}
