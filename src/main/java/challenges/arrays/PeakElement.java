package challenges.arrays;

import java.util.Arrays;

public class PeakElement
{
    public static int peakElement(final int[] array) {
        final int arraySize = array.length;

        if (arraySize == 1) {
            return 0;
        }

        for (int index = 0; index < arraySize; index++) {
            boolean isPeak = (index == 0) ?
                    isPeak(array[index], array[index + 1]) :
                    (index == arraySize - 1) ?
                            isPeak(array[index], array[index - 1]) :
                            isPeak(array[index], array[index - 1], array[index + 1]);
            if (isPeak) {
                return index;
            }
        }

        return -1;
    }

    private static boolean isPeak(final int elementToCheck, final int... neighbors) {
        return Arrays.stream(neighbors).noneMatch(neighbor -> elementToCheck < neighbor);
    }
}
