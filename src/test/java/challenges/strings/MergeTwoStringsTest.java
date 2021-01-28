package challenges.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * <p>
 * Unit tests for {@link MergeTwoStrings}.
 * </p>
 *
 * @author Nordryd
 */
public class MergeTwoStringsTest
{
    @ParameterizedTest
    @CsvSource({ "Hello, Bye, HBeylelo", "abc, def, adbecf", "abcde, fgh, afbgchde" , "abc, defgh, adbecfgh"})
    public void testMerge(final String string1, final String string2, final String expected) {
        assertEquals(expected, MergeTwoStrings.merge(string1, string2));
    }
}
