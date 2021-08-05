package challenges.arrays;

import java.util.Arrays;

public class RotateArray
{
    public static int[] rotateArray(final int[] array, final int rotations) {
        final int arraySize = array.length;
        int[] doubledArray = new int[arraySize * 2];
        Arrays.setAll(doubledArray, index -> array[index % arraySize]);
        return Arrays.copyOfRange(doubledArray, rotations, rotations + arraySize);
    }
}
