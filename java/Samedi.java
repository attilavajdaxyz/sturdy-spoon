public class Samedi {

    public static boolean isSingleDigit(int x) {
        return x > -10 && x < 10;
    }

    public static void main(String[] args) {
        int x = 1;
        boolean evenFlag = (x % 2 == 0);    // true if x is even
        boolean positiveFlag = (x > 0);     // true if x is positive
        if (evenFlag) {}
        else if (positiveFlag) {}

        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit(17);
    }
}
