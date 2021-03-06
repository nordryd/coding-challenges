package challenges.strings;

import static java.util.Arrays.sort;

import java.util.stream.IntStream;

/**
 * <p>
 * https://practice.geeksforgeeks.org/problems/anagram-1587115620/1
 * </p>
 *
 * @author Nordryd
 */
public class Anagram
{
    /**
     * Checks if the given strings are anagrams of each other.
     *
     * @param a a string of length [1, 10^5].
     * @param b a string of length [1, 10^5].
     * @return {@code true} if the strings are anagrams of each other.
     */
    public static boolean isAnagram(final String a, final String b) {
        if (a.length() != b.length()) {
            return false;
        }

        final char[] aArray = a.toCharArray();
        final char[] bArray = b.toCharArray();

        sort(aArray);
        sort(bArray);

        return IntStream.range(0, a.length()).noneMatch(charIndex -> (aArray[charIndex] != bArray[charIndex]));
    }
}
