package com.javafortesters.myfirsttest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MyFirstTest2 {
    @Test
    public void integerExplorations(){
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }

    @Test
    public void integerExploration() {
        Integer five = 5;
        assertEquals("autoboxing assignment for 5", 5, five.intValue());
    }

}
