public class Factorial {
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
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
