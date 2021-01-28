package challenges.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * <p>
 * Unit test for {@link Anagram}.
 * </p>
 *
 * @author Nordryd
 */
public class AnagramTest
{
    @ParameterizedTest
    @CsvSource(value = { "geeksforgeeks, forgeeksgeeks", "aaa, aaa", "EMPTY, EMPTY" }, emptyValue = "EMPTY")
    public void testIsAnagram_true(final String s1, final String s2) {
        assertTrue(Anagram.isAnagram(s1, s2));
    }

    @ParameterizedTest
    @CsvSource({ "allergy, allergic", "bbb, bb", "allergy, allergi" })
    public void testIsAnagram_false(final String s1, final String s2) {
        assertFalse(Anagram.isAnagram(s1, s2));
    }
}
