package com.example.alex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    private List<String> items;

    @BeforeEach
    void setUp() {
        items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
    }

    @AfterEach
    void tearDown() {
        items.clear();
    }

    @Test
    void testAddItem() {
        String newItem = "Cherry";
        items.add(newItem);
        assertEquals(3, items.size());
        assertTrue(items.contains("Cherry"));
    }

    @Test
    void testRemoveItem() {
        String itemToRemove = "Apple";
        items.remove(itemToRemove);
        assertEquals(1, items.size());
        assertFalse(items.contains("Apple"));
    }

    @Test
    void testInitialSetup() {
        int size = items.size();
        assertEquals(2, size);
        assertTrue(items.contains("Apple"));
        assertTrue(items.contains("Banana"));
    }
}
