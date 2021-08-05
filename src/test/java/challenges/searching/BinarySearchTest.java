package challenges.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BinarySearchTest
{
    @ParameterizedTest
    @MethodSource("testBinarySearch_tests")
    public void testBinarySearch(final int toFind, final int[] array, final int expectedLocationIndex) {
        assertEquals(expectedLocationIndex, BinarySearch.binarySearch(toFind, array.length, array));
    }

    private static Stream<Arguments> testBinarySearch_tests() {
        return Stream.of(Arguments.of(4, new int[] { 1, 2, 3, 4, 5 }, 3),
                Arguments.of(445, new int[] { 11, 22, 33, 44, 55 }, -1));
    }
}
