package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for calculator multiplication and division
 */
public class CalculatorMultiplicationTest 
{
    @Test
    public void shouldEqualTwentyOne()
    {
        float correctAnswer = 21;
        assertEquals(correctAnswer, Calculator.Multiplication(7, 3), 0.000001);
    }

    @Test
    public void DivisionTest()
    {
        float correctAnswer = 0.41666f;
        assertEquals(correctAnswer, Calculator.Division(5, 12), 0.00001);
    }
}
