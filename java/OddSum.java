public class OddSum {
    public static int oddSum(int n){
        if (n == 1) {
            return 1;
        } else {
            int recurse = oddSum(n - 2);
            int result = n + recurse;
            System.out.println(recurse);
            System.out.println(result);
            return result;
        }
    }
    public static void main (String[] args) {
        oddSum(5);
    }
}
