public class Fibonacci {
    public static int fibonacci(int n){
        if (n == 2 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci (n - 2);
        }
    }
    public static void main (String[] args){
        System.out.println(fibonacci(10));
    }
}
