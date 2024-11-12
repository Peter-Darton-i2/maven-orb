package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for calculator, excluding multiplication and division
 */
public class CalculatorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldEqualFive()
    {
        float correctAnswer = 5;
        assertEquals(correctAnswer, Calculator.Addition(2,3), 0.000001);
    }

    @Test
    public void shouldEqualThree()
    {
        float correctAnswer = 3;
        assertEquals(correctAnswer, Calculator.Subtraction(5, 2), 0.000001);
    }
}
