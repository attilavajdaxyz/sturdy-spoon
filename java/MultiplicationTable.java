public class MultiplicationTable {
    public static void printRow(int n, int cols) {
        for (int i = 1; i <= cols; i++) {
            System.out.printf("%4d", n * i);  // generalized n
        }
        System.out.println();
    }
    public static void printTable(int rows) {
        for (int i = 1; i <= rows; i++) {
            printRow(i, rows);
        }
    }
    public static void main(String[] args) {
        printTable(7);
    }
}
