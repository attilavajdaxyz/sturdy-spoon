public class PowerPower {
    public static double power(double x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / x * power(x, n-1);
        } else {
            return x * power(x, n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(power(3.0, 2));
    }
}
