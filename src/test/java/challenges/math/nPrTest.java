package challenges.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class nPrTest
{
    @ParameterizedTest
    @CsvSource(value = { "2, 1, 2", "3, 3, 6" })
    public void testNPR(final long n, final long r, final long expected) {
        assertEquals(expected, nPr.nPr(n, r));
    }

    @ParameterizedTest
    @CsvSource(value = { "0, 1", "1, 1", "2, 2", "3, 6", "4, 24", "5, 120", "6, 720" })
    public void testFactorial(final long n, final long expected) {
        assertEquals(expected, nPr.factorial(n));
    }
}
