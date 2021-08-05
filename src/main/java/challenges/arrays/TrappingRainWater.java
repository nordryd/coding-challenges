package challenges.arrays;

public class TrappingRainWater
{
    public static int trappingWater(final int[] heights) {

        // find the first "dropoff" height = the first point where the height drops

        // only go as far as the dropoff point

        int leftDropoffHeight = heights[0];
        int leftDropoffIndex = 0;
        int index = 1;
        while (index < heights.length - 1) {
            final int currentHeight = heights[index];
            if (currentHeight < leftDropoffHeight) {
                break;
            }
            leftDropoffHeight = currentHeight;
            leftDropoffIndex++;
            index++;
        }

        int capturedWaterFromLeftPass = 0;
        while (index < heights.length - 1) {
            int capturedWater = leftDropoffHeight - heights[index];
            if (capturedWater > 0) {
                capturedWaterFromLeftPass += capturedWater;
            }
            index++;
        }

        // add a boolean flag to say when the dropoff height has been found and change what calculation is done
        // isDropoffHeightFound

        int rightDropoffHeight = heights[heights.length - 1];
        int rightDropoffIndex = heights.length - 1;
        index = heights.length - 2;
        while (index > leftDropoffIndex) {
            final int currentHeight = heights[index];
            if (currentHeight < rightDropoffHeight) {
                break;
            }
            rightDropoffHeight = currentHeight;
            rightDropoffIndex--;
            index--;
        }

        int capturedWaterFromRightPass = 0;
        while (index --> leftDropoffIndex) {
            int capturedWater = rightDropoffHeight - heights[index];
            if (capturedWater > 0) {
                capturedWaterFromRightPass += capturedWater;
            }
            index--;
        }

        final int maxDropoffHeight = Math.max(leftDropoffHeight, rightDropoffHeight);
        boolean hasHigherMidHeight = false;
        for (index = leftDropoffIndex; (index < rightDropoffIndex) && !hasHigherMidHeight; index++) {
            if (heights[index] > maxDropoffHeight) {
                hasHigherMidHeight = true;
            }
        }

        // if there's a middle height greater than the max dropoff height, then just subtract the values and give the abs value?
        // the captured waters from each pass are correct. this is not. 11 + 4 = 15 - 11 = 4, but 11 - 4 = 7 which is correct
        return hasHigherMidHeight ?
                Math.abs(capturedWaterFromLeftPass - capturedWaterFromRightPass) :
                (capturedWaterFromLeftPass + capturedWaterFromRightPass) -
                        Math.max(capturedWaterFromLeftPass, capturedWaterFromRightPass);
    }
}
