package challenges.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PeakElementTest
{
    @ParameterizedTest
    @MethodSource("testPeakElement_tests")
    public void testPeakElement(final int[] array, final int expected) {
        assertEquals(expected, PeakElement.peakElement(array));
    }

    private static Stream<Arguments> testPeakElement_tests() {
        return Stream.of(Arguments.of(new int[] { 3 }, 0), Arguments.of(new int[] { 1, 2, 3 }, 2),
                Arguments.of(new int[] { 3, 4 }, 1));
    }
}
