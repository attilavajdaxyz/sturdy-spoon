public class Whiloop {
    public static void whiloop() {
        int n = 3;
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    public static void sincrease(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {         // n is even
                n = n / 2;
            } else {                  // n is odd
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }
    public static voi   d main (String[] args) {
        System.out.println("Hello while loop!");
        whiloop();
        sincrease(3);
    }
}
