package challenges.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JosephusTest
{
    @ParameterizedTest
    @CsvSource(value = { "3, 2, 3", "5, 3, 4" })
    public void testFindSafeSeat(final int persons, final int remainingAfterEvensKilled, final int expectedSafeSeat) {
        assertEquals(expectedSafeSeat, Josephus.findSafeSeat(persons, remainingAfterEvensKilled));
    }
}
