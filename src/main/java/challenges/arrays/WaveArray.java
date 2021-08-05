package challenges.arrays;

public class WaveArray
{
    public static int[] convertToWave(final int[] array, final int arraySize) {
        for (int index = 0; index < arraySize - 1; index += 2) {
            final int element = array[index];
            array[index] = array[index + 1];
            array[index + 1] = element;
        }

        return array;
    }
}
