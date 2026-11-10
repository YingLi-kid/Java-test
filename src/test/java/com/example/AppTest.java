package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void shouldAddTwoNumbers()
    {
        assertEquals(30, App.add(10, 20));
    }
}