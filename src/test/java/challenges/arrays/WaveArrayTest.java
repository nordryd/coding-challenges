package challenges.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class WaveArrayTest
{
    @ParameterizedTest
    @MethodSource("testWaveArrays_tests")
    public void testWaveArrays(final int[] array, final int[] expected) {
        assertArrayEquals(expected, WaveArray.convertToWave(array, array.length));
    }

    private static Stream<Arguments> testWaveArrays_tests() {
        return Stream.of(Arguments.of(new int[] { 1, 2, 3, 4, 5 }, new int[] { 2, 1, 4, 3, 5 }),
                Arguments.of(new int[] { 2, 4, 7, 8, 9, 10 }, new int[] { 4, 2, 8, 7, 10, 9 }));
    }
}
