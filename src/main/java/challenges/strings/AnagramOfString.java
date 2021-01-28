package challenges.strings;

/**
 * <p>
 * https://practice.geeksforgeeks.org/problems/anagram-of-string/1
 * </p>
 *
 * @author Nordryd
 */
public class AnagramOfString
{
    /**
     * Checks if two strings are anagrams of each other, and how many characters must be removed (total from both strings) to turn them into anagrams of each other.
     *
     * @param s a string of length [1, 10^5]
     * @param s1 a string of length [1, 10^5]
     * @return the minimum number of characters <i>total from both strings</i> that must be deleted to turn the give strings into anagrams of each other.
     */
    public static int remAnagrams(final String s, final String s1) {
        return filterMatchingCharacters(s, s1).length() + filterMatchingCharacters(s1, s).length();
    }

    private static String filterMatchingCharacters(final String input, final String filterString) {
        return filterString.isEmpty() ?
                input :
                filterMatchingCharacters(input.replaceFirst(String.valueOf(filterString.charAt(0)), ""),
                        filterString.substring(1));
    }
}
