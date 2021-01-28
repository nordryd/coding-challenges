package challenges.strings;

/**
 * <p>
 * https://practice.geeksforgeeks.org/problems/merge-two-strings/0
 * </p>
 *
 * @author Nordryd
 */
public class MergeTwoStrings
{
    /**
     * Merges two strings alternatively.
     *
     * @param string1 a string of length [1, 10^4]
     * @param string2 a string of length [1, 10^4]
     * @return the merged string.
     */
    public static String merge(final String string1, final String string2) {
        return string1.isEmpty() ?
                string2 :
                string2.isEmpty() ?
                        string1 :
                        String.valueOf(string1.charAt(0)) + string2.charAt(0) +
                                merge(string1.substring(1), string2.substring(1));
    }
}
