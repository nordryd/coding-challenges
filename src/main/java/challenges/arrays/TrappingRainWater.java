package challenges.arrays;

public class TrappingRainWater
{
    public static int trappingWater(final int[] heights) {

        // find the first "dropoff" height = the first point where the height drops

        int leftDropoffHeight = heights[0];
        int index = 1;
        while (index < heights.length - 1) {
            final int currentHeight = heights[index];
            if (currentHeight < leftDropoffHeight) {
                break;
            }
            leftDropoffHeight = currentHeight;
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

        System.out.println(capturedWaterFromLeftPass);

        // add a boolean flag to say when the dropoff height has been found and change what calculation is done
        // isDropoffHeightFound

        int rightDropoffHeight = heights[heights.length - 1];
        index = heights.length - 1;
        while(index > 0){
            final int currentHeight = heights[index];
            if(currentHeight < rightDropoffHeight){
                break;
            }
            rightDropoffHeight = currentHeight;
            index--;
        }

        int capturedWaterFromRightPass = 0;
        while(index > 0){
            int capturedWater = rightDropoffHeight - heights[index];
            if (capturedWater > 0) {
                capturedWaterFromRightPass += capturedWater;
            }
            index--;
        }

        return (capturedWaterFromLeftPass + capturedWaterFromRightPass) -
                Math.max(capturedWaterFromLeftPass, capturedWaterFromRightPass);
    }
}
