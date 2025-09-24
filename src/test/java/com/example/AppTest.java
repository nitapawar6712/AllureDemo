package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class AppTest {

    @Test
    @Description("Simple test to check addition")
    public void testAddition() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        assertEquals(sum, 15, "Sum should be 15");
    }
     @Test
    @Description("Simple test to check addition")
    public void testSub() {
        int a = 20;
        int b = 10;
        int diff = a - b;
        assertEquals(diff, 10, "Sum should be 10");
    }
    public void testMult() {
        int a = 20;
        int b = 10;
        int Mult = a * b;
        assertEquals(Mult, 200, "Sum should be 200");
    }
}
