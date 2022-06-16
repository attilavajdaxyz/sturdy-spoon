public class SquareAndSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        //Your Code
        for (int i : n) {
            sum += i * i;
        }
        return sum;
    }
}
