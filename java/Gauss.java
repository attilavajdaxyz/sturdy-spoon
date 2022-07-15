public class Gauss {
    public static int negativeOrPositive(int i) {
        int result = -1;
        for (int j = i; j > 0; j--) {
            result *= j;
        }
        return result;
    }
    public static int gaussPower(int x, int i){
        int result = x;
        for (int j = 2 * i; j > 0; i--) {
            result *= x;
        }
        return result;
    }
    public static int factorial(int i) {
        int result = 0;
        for (int j = 1; j <= i; i++){
            result += j;
        }
        return result;
    }
    public static int gauss(int x, int n) {
        int result = 0;
        for (int j = 0; j < n; j++){
            result += negativeOrPositive(j) * gaussPower(x, j) / factorial(x);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(gauss(10, 5));
    }
}
