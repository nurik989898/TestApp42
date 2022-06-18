package com.example.testapp42;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;
    @Before
    public void install(){
      math = new Math();
    }
    @Test
    public void simpleAddTest(){
        assertEquals("12",math.add("6","6"));
    }
    @Test
    public void letterAddTest(){
        assertEquals("Буквы складывать нельзя",math.add("6","a"));
    }
    @Test
    public void spaceAddTest(){
        assertEquals("C пробелами нельзя",math.add("6"," "));
    }
    @Test
    public void withDotAddTest(){
        assertEquals("Только целые числа",math.add("6","6.2"));
    }
    @Test
    public void minNumAddTest(){
        assertEquals("Отрицательные числа нельзя",math.add("6","-6"));
    }
    @Test
    public void nullAddTest(){
        assertEquals("Error",math.add("6",null));
    }
    @Test
    public void zeroDivFail(){
        assertEquals("0 не может делен число",0,math.divide(1,2));
    }


    @After
    public void detach(){
        math = null;
    }
}
