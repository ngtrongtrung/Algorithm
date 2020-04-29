package algorithm.numericalProblem;

/**
 * @author : Nguyen Trong TRUNG
 */
public class FibonacciNumber {
    public static long findNthFibonacciByUsingRecursive(int n)
    {
        if(n<=1) return n;
        else return findNthFibonacciByUsingRecursive(n-1)+findNthFibonacciByUsingRecursive(n-2);
    }

    public static long findNthFibonacciByUsingIterative(int n)
    {
        long[] F = new long[n+1];
        F[0]=0;F[1]=1;
        for(int i=2;i<=n;i++)
            F[i]=F[i-1]+F[i-2];
        return F[n];
    }
}
