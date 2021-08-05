package challenges.searching;

public class FacingTheSun
{
    public static int countBuildingsHitBySunlight(final int[] heights, final int numOfBuildings) {
        int currentMaxHeight = heights[0];
        int willSeeSunrise = 1;

        for (int heightIndex = 1; heightIndex < numOfBuildings; heightIndex++) {
            final int currentHeight = heights[heightIndex];
            if (currentHeight > currentMaxHeight) {
                willSeeSunrise++;
                currentMaxHeight = currentHeight;
            }
        }

        return willSeeSunrise;
    }
}
