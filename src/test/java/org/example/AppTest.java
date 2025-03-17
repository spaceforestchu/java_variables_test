package org.example;


import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testInt() {
        assertEquals(42, App.intValue());
    }

    @Test
    public void testDouble() {
        assertEquals(3.14, App.doubleValue(), 0.001);
    }

    @Test
    public void testBoolean() {
        assertTrue(App.booleanValue());
    }

    @Test
    public void testChar() {
        assertEquals('A', App.charValue());
    }

    @Test
    public void testString() {
        assertEquals("Hello", App.stringValue());
    }
}