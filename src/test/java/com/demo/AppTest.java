package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testSuma() {
        assertEquals(0, App.suma(3, 4));
    }

    @Test
    void testResta() {
        assertEquals(7, App.resta(10, 3));
    }
}
