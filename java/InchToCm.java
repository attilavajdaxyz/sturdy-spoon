import java.util.Scanner;

public class InchToCm {

    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);

        System.out.print("How many inches? ");
        inch = in.nextInt();

        final double CM_PER_INCH = 2.54;
        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

        System.out.printf("Four thirds = %.3f", 4.0 / 3.0);

        double pi = 3.14159;
        int x = (int) pi;

        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%f cm = %d in\n", cm, inch);
    }
}