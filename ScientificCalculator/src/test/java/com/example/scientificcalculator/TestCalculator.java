package com.example.scientificcalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    @Test
    void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16));
        assertEquals(5.0, calculator.squareRoot(25));
        assertEquals(3.0, calculator.squareRoot(9));
    }

    @Test
    void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testNaturalLogarithm() {
        assertEquals(0.0, calculator.naturalLogarithm(1));
        assertEquals(2.302585092994046, calculator.naturalLogarithm(10), 1e-6);
        assertEquals(1.0, calculator.naturalLogarithm(2.71828), 1e-6);
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2, 3));
        assertEquals(1.0, calculator.power(5, 0));
        assertEquals(2.0, calculator.power(4, 0.5));
    }
}
