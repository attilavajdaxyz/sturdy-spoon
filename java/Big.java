import java.math.BigInteger;

public class Big {
    public static BigInteger convertIntToBigInteger(int i) {
        return BigInteger.valueOf(i);
    }
    public static int convertBigIntegerToInt(BigInteger i) {
        return i.intValue();
    }
    public static void factorial(int n) {
        for (int i = 0; i < n; i++) {
            BigInteger factorial = BigInteger.valueOf(1);
            for (int j = 1; j <= i; j++) {
                factorial = factorial.multiply(convertIntToBigInteger(j));
            }
            System.out.println(i + "! = " + factorial);
        }
    }
    public static void main(String[] args) {
        factorial(10);
    }
}
