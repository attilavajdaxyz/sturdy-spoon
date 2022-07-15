import java.math.BigInteger;

public class Pow {
    public static BigInteger pow(int x, int n) {
        if (n == 0) {
            System.out.println("x^n = " + 1);
            return BigInteger.valueOf(1);
        }
    
        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);
        System.out.println("x^n = " + t);
    
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            System.out.println("n is even, " + n);
            System.out.println("t * t is " + t + "*" + t);
            return t.multiply(t);
        } else {
            System.out.println("n is odd, " + n);
            System.out.println("t * t * x is " + t + "*" + t + "*" + x);
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 100));
    }
}
