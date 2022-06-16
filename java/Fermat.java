public class Fermat {

    public static boolean fermat(int a, int b, int c, int n) {
        boolean wasRight = (Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n);
        return wasRight;
    }
    public static void main(String[] args) {
        System.out.println("Hello World, was Fermat write?");
        boolean fermatWasWrite = fermat(2, 3, 4, 5);
        boolean fermatWasWrong = !fermatWasWrite;
        if (fermatWasWrong){
            System.out.println("Holy Smokes! Fermat was wrong.");
        }
        else {
            System.out.println("Fermat was right.");
        }
    }
}