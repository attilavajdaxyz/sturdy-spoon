public class MyExp {
    public static double power(double x, int n){
        if (n == 0) { // This is fun. I can do it. 😌          
            return 1;
        } else if (n < 0) { 
            return 1 / power(x, -n);
        } // Wow this is the most beautiful code I have ever written.
        else if (n % 2 == 0) {
            return power(x, n / 2) * power(x, n / 2);
        } else {
            return x * power(x, n / 2) * power(x, n / 2);
        }
    }
    public static int factorial(int n){
        // Base case.
        if (n == 0) {
            return 1;
        } else {
            int recurse = factorial(n - 1);
            int result = n * recurse;
            return result;
        }   
    }
    public static int ex (int x, int n){
        if (n == 0) {
            return 1;
        } else {
            int result = 1 + x;
            for (int i = 0; i < n; i++) {
               result += power(x, i) / factorial(i);
            }
            return result;
        }
    }
    public static void main(String[] args){
        System.out.println(ex(2, 4));
    }
}


// ex = 1 + x + x2 / 2! + x3 / 3! + x4 / 4! + 