package challenges.recursion;

public class Josephus
{
    public static int findSafeSeat(final int persons, final int remainingAfterEvensKilled) {
        return (persons == 1) ?
                1 :
                (findSafeSeat(persons - 1, remainingAfterEvensKilled) + remainingAfterEvensKilled - 1) % persons + 1;
    }
}
