package com.example.lab8;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

//    @Before
//    public void createList(){
//        list = new CustomList(null, new ArrayList<City>());
//    }

    @Test
    public void addCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    public void testTest(){

    }
}
