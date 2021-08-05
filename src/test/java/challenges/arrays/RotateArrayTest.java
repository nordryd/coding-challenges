package challenges.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RotateArrayTest
{
    @ParameterizedTest
    @MethodSource("testRotateArray_test")
    public void testRotateArray(final int[] array, final int rotations, final int[] expected) {
        assertArrayEquals(expected, RotateArray.rotateArray(array, rotations));
    }

    private static Stream<Arguments> testRotateArray_test() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 3, 4, 5 }, 2, new int[] { 3, 4, 5, 1, 2 }),
                Arguments.of(new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }, 3, new int[] { 8, 10, 12, 14, 16, 18, 20, 2, 4, 6 })
        );
    }
}
