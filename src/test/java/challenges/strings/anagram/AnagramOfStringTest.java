package challenges.strings.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * <p>
 * Unit tests for {@link AnagramOfString}.
 * </p>
 *
 * @author Nordryd
 */
public class AnagramOfStringTest
{
    @ParameterizedTest
    @CsvSource({ "bcadeh, hea, 3", "cddgk, gcd, 2", "crap, arcp, 0", "abcd, efgh, 8",
            "basgadhbfgvhads, sjdhgvbjdsbhvbvd, 11" })
    public void testRemAnagrams(final String s1, final String s2, final int expected) {
        assertEquals(expected, new AnagramOfString().remAnagrams(s1, s2));
    }
}
