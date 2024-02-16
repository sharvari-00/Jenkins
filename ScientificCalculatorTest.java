import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    @Test
    void testSquareRoot() {
        assertEquals(4.0, ScientificCalculator.squareRoot(16));
        assertEquals(5.0, ScientificCalculator.squareRoot(25));
        assertEquals(3.0, ScientificCalculator.squareRoot(9));
    }

    @Test
    void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0));
        assertEquals(1, ScientificCalculator.factorial(1));
        assertEquals(120, ScientificCalculator.factorial(5));
    }

    @Test
    void testNaturalLogarithm() {
        assertEquals(0.0, ScientificCalculator.naturalLogarithm(1));
        assertEquals(2.302585092994046, ScientificCalculator.naturalLogarithm(10), 1e-6);
        assertEquals(1.0, ScientificCalculator.naturalLogarithm(2.71828), 1e-6);
    }

    @Test
    void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3));
        assertEquals(1.0, ScientificCalculator.power(5, 0));
        assertEquals(2.0, ScientificCalculator.power(4, 0.5));
    }
}
