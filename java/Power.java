public class Power {
    public static double power(double x, int n){
        if (n == 0) { // This is fun. I can do it. 😌
            System.out.println(x); // I have two variables, which are x and n.
            System.out.println(n);            
            return 1;
        } else if (n < 0) {
            double result = 1 / power(x, -n); 
            System.out.println(result);
            return 1 / power(x, -n);
        } // Wow this is the most beautiful code I have ever written.
        else if (n % 2 == 0) {
            return power(x, n / 2) * power(x, n / 2);
        } else {
            return x * power(x, n / 2) * power(x, n / 2);
        }
    }
    public static void main(String[] args){
        power(3.0, 2); // What will this print?
    }
}
