package challenges.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * <p>
 * Unit tests for {@link Palindrome}.
 * </p>
 *
 * @author Nordryd
 */
public class PalindromeTest
{
    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = { "abba", "racecar", "a", "aa" })
    public void testIsPalindrome_true_string(final String string) {
        assertTrue(Palindrome.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = { "ba", "abc" })
    public void testIsPalindrome_false_string(final String string) {
        assertFalse(Palindrome.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1221, 12321, 1, 22, 0 })
    public void testIsPalindrome_true_number(final int number) {
        assertTrue(Palindrome.isPalindrome(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 12, 123 })
    public void testIsPalindrome_false_number(final int number) {
        assertFalse(Palindrome.isPalindrome(number));
    }

    @ParameterizedTest
    @ValueSource(doubles = { 12.21, 1.1 })
    public void testIsPalindrome_true_number(final double number) {
        assertTrue(Palindrome.isPalindrome(number));
    }

    @ParameterizedTest
    @ValueSource(doubles = { 1.2, 1.23, 1.0, 0.1, 1.01, 10.1 })
    public void testIsPalindrome_false_number(final double number) {
        assertFalse(Palindrome.isPalindrome(number));
    }
}
