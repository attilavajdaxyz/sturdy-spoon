import java.util.Scanner;

public class Zoop {

    public static void doobop(String frejolous) {
        int numbeber;

        // Ask for input.
        System.out.print("Type a number between 1 and 100: ");
        Scanner in = new Scanner(System.in);
        numbeber = in.nextInt();

        // Print out input.
        System.out.printf("Your number is %d", numbeber);
        System.out.println();
        System.out.printf("Your frejolous is %s 😌", frejolous);

    }
    public static void main (String[] args) {
        System.out.println("mooz");
        doobop("Droomop");
    }
}
