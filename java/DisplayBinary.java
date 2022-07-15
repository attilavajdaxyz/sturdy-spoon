public class DisplayBinary {
    public static void displayBinary(int decimal) {
        if (decimal > 0) {
            displayBinary(decimal / 2);
            System.out.print(decimal %  2);
        }
    }
    public static void main(String[] args) {
        displayBinary(25);
    }
}
