package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");
        list.addCity(edmonton);
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertTrue(list.hasCity(edmonton));
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");
        assertTrue(list.countCity() == 0);
        list.addCity(edmonton);
        assertTrue(list.countCity() == 1);
        list.addCity(calgary);
        assertTrue(list.countCity()== 2);
    }
}
