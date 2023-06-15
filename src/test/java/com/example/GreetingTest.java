package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest {

    @Test
    public void testGreeting() {
        String message= "Bye, Maven!";
        assertEquals("Greeting message is incorrect", message, Greeting.getGreeting());
    }
}