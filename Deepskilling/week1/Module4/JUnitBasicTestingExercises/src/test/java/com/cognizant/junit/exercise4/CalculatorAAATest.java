package com.cognizant.junit.exercise4;

import com.cognizant.junit.exercise2.Calculator;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        System.out.println("Cleanup completed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        
        int result = calculator.add(a, b);

        
        assertEquals(30, result);
    }
}
