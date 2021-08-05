package challenges.math;

public class nPr
{
    public static long nPr(final long n, final long r){
        return factorial(n) / factorial(n - r);
    }

    public static long factorial(final long n){
        return (n <= 1) ? 1 : (n == 2) ? 2 : n * factorial(n - 1);
    }
}
