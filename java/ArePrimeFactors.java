import java.util.Arrays;

public class ArePrimeFactors {
    public static boolean[] sieve(int n) {
        boolean[] result = new boolean[n];
        Arrays.fill(result, true);
        int currentPrime = 2;
        for (int banana = 1; banana < n; banana++) {
            if (result[banana] == true) {
                currentPrime = banana + 1;
                for (int pear = currentPrime * 2 - 1; pear < n; pear += currentPrime) {
                    result[pear] = false;
                }
            }
            for (int apple = banana + 1; apple < n; apple++) {
                if (result[apple] == true) {
                    banana = apple - 1;
                    break; 
                }   
            }
        }
        return result;
    }
    public static boolean arePrimeFactors(int[] a, int num) {
        int n = a.length;

        // Checking the largest number in the array, for the maximum number for our sieve.
        int maxOfA = 0;
        for (int e: a) {
            if (e > maxOfA) {
                maxOfA = e;
            }
        }
        
        // Checking if numbers in array are prime and are divisors of number.
        boolean[] aSieve = sieve(maxOfA);
        for (int e: a) {
            if (aSieve[e - 1] == false) {
                return false;
            } else if (num % e != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        int[] a = {2, 3, 5};
        System.out.println(arePrimeFactors(a, 30));
    }

}
