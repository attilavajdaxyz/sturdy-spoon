import java.util.Arrays;

public class Sieve {
    public static void printArray(boolean[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1) {
                System.out.print(a[i]);
                System.out.print(i + 1);
            } else {
                System.out.print(i + 1);
                System.out.print(a[i] + ",");
            }
        }
        System.out.println("}");
    }
    public static boolean[] sieve(int n) {
        boolean[] result = new boolean[n];
        Arrays.fill(result, true); // {true, true, true, true, true, true, true, true, true}
        int currentPrime = 2;
        for (int banana = 1; banana < n; banana++) {   // i is 1 - traversing the result array
            if (result[banana] == true) {
                currentPrime = banana + 1;
                for (int pear = currentPrime * 2 - 1; pear < n; pear += currentPrime) {  // traversing the prime numbers
                    result[pear] = false;
                } // dear rubber duck, or dear coffee mug, ezt az egeszet berakjuk
            }
            for (int apple = banana + 1; apple < n; apple++) {
                System.out.println("Entering the for loop.");

                if (result[apple] == true) {
                System.out.println("Entering the if statement.");
                    banana = apple - 1;
                System.out.println("Exiting the if statement."); // craftsmanship with focus on the work itself. Not competition.
                    break;  // Exiting the for loop.
                }   
                System.out.println("Exiting the for loop.");
            }
        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println("Hello World! This is the Sieve of Erathostenes.");
        boolean[] array = sieve(100);
        printArray(array);
    }
}
