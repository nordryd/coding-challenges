package challenges.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FacingTheSunTest
{
    @ParameterizedTest
    @MethodSource("testFacingTheSun_tests")
    public void testFacingTheSun(final int[] heights, final int expected) {
        assertEquals(expected, FacingTheSun.countBuildingsHitBySunlight(heights, heights.length));
    }

    private static Stream<Arguments> testFacingTheSun_tests() {
        return Stream.of(Arguments.of(new int[] { 7, 4, 8, 2, 9 }, 3), Arguments.of(new int[] { 2, 3, 4, 5 }, 4),
                Arguments.of(new int[] { 9, 1, 1 }, 1));
    }
}
