package challenges.searching;

/**
 * Had to refresh memory on how to do this, so count this as an example problem.
 */
public class BinarySearch
{
    public static int binarySearch(final int target, final int arraySize, final int... array) {
        return binarySearch(0, arraySize - 1, target, array);
    }

    private static int binarySearch(final int left, final int right, final int target, final int... array) {
        if (left > right) {
            // This is an invalid tree.
            return -1;
        }

        // Find the midpoint. First pass of this is the entire array, so this is the middle.
        int mid = (left + right) / 2;

        // Have we found the element? Return the index.
        if (array[mid] == target) {
            return mid;
        }

        // Element not found.
        // If midpoint is greater than target, target is in the left. Remove the rightside of the tree by changing right to be the midpoint minus 1.
        // If midpoint is less than target, target is in the right. Remove the leftside of the tree by changing left to be the midpoint plus 1.
        return (array[mid] > target) ?
                binarySearch(left, mid - 1, target, array) :
                binarySearch(mid + 1, right, target, array);
    }
}
