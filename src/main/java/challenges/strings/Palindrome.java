package challenges.strings;

import static java.util.stream.IntStream.range;

/**
 * <p>
 * https://practice.geeksforgeeks.org/problems/palindrome-string/0
 * </p>
 *
 * @author Nordryd
 */
public class Palindrome
{
    /**
     * Checks if the string is a palindrome.
     *
     * @param string a string of length [1, 10^5].
     * @return {@code true} if the string is a palindrome.
     */
    public static boolean isPalindrome(final String string) {
        if (string.isEmpty() || (string.length() == 1)) {
            return true;
        }

        final int originalStringLength = string.length();
        final int halfwayPoint = originalStringLength / 2;
        final String formerHalf = string.substring(0, halfwayPoint);
        final String latterHalf = string.substring(halfwayPoint + (originalStringLength % 2), originalStringLength);

        return range(0, halfwayPoint).noneMatch(charIndexOffset -> formerHalf.charAt(charIndexOffset) !=
                latterHalf.charAt(halfwayPoint - charIndexOffset - 1));
    }

    /**
     * Checks if the number is a palindrome.
     *
     * @param number a number
     * @return {@code true} if the number is a palindrome.
     */
    public static boolean isPalindrome(final int number) {
        return isPalindrome(String.valueOf(number));
    }

    /**
     * Checks if the number is a palindrome.
     *
     * @param number a number
     * @return {@code true} if the number is a palindrome.
     */
    public static boolean isPalindrome(final double number) {
        return isPalindrome(String.valueOf(number));
    }
}
