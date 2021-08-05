package challenges.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IsSumOfDigitsPalindromeTest
{
    @ParameterizedTest
    @CsvSource(value = { "56, 1", "98, 0" })
    public void testIsSumOfDigitsPalindrome(final int n, final int expected) {
        assertEquals(expected, IsSumOfDigitsPalindrome.isSumOfDigitsAPalindrome(n));
    }
}
