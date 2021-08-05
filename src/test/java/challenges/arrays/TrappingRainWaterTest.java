package challenges.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TrappingRainWaterTest
{
    @ParameterizedTest
    @MethodSource("testTrappingWater_tests")
    public void testTrappingWater(final int[] heights, final int expected) {
        assertEquals(expected, TrappingRainWater.trappingWater(heights));
    }

    private static Stream<Arguments> testTrappingWater_tests() {
        return Stream
                .of(
                        Arguments.of(new int[] { 3, 0, 0, 2, 0, 4 }, 10),
                        Arguments.of(new int[] { 4, 0, 0, 2, 0, 3 }, 10),
                        Arguments.of(new int[] { 7, 4, 0, 9 }, 10),
                        Arguments.of(new int[] { 9, 4, 0, 7 }, 10),
                        Arguments.of(new int[] { 6, 9, 9 }, 0),
                        Arguments.of(new int[] { 9, 9, 6 }, 0),
                        Arguments.of(new int[] { 8, 8, 2, 4, 5, 5, 1 }, 4),
                        Arguments.of(new int[] { 1, 5, 5, 4, 2, 8, 8 }, 4));
    }
}
