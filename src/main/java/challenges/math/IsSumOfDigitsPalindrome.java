package challenges.math;

import java.util.stream.IntStream;

public class IsSumOfDigitsPalindrome
{
    public static int isSumOfDigitsAPalindrome(final int n) {
        final String digitsAsChars = String.valueOf(n);
        final String sumOfDigits = String.valueOf(IntStream.range(0, digitsAsChars.length())
                .map(charIndex -> Integer.parseInt(String.valueOf(digitsAsChars.charAt(charIndex)))).sum());

        for (int charIndex = 0; charIndex < (sumOfDigits.length() / 2); charIndex++) {
            if (sumOfDigits.charAt(0) != sumOfDigits.charAt(sumOfDigits.length() - 1 - charIndex)) {
                return 0;
            }
        }

        return 1;
    }
}
