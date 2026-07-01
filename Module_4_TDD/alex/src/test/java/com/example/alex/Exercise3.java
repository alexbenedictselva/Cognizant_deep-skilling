package com.example.alex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Exercise3 {

    @Test
    public void checkasserts() {
        assertEquals(4, 2 + 2);
        assertTrue(5 > 3);
    }

}