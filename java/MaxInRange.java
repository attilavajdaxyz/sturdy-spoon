public class MaxInRange {
    public static void maxInRange(int[] a, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            System.out.println(a[lowIndex]);
        } else {
            if (a[lowIndex] < a[highIndex]) {
                maxInRange(a, lowIndex + 1, highIndex);
            } else if (a[lowIndex] > a[highIndex]) {
                maxInRange(a, lowIndex, highIndex - 1);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        maxInRange(a, 3, 9);
    }
}