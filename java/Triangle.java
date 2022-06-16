import java.util.Scanner;

public class Triangle {
    public static boolean isTriangle(double a, double b, double c) {
        if (b + c < a || a + c < b || a + b < c) {
            return false;
        } else return true;
    }
    public static void main (String[] args){
        double a;
        double b;
        double c;

        // Prompt user for input of the three sides of the triangle.
        System.out.println("Add side a of the triangle: ");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextDouble()) {
            System.out.println("Add a valid number: ");
            in = new Scanner(System.in);
        } a = in.nextDouble();

        System.out.println("Add side b of the triangle");
        in = new Scanner(System.in);
        while (!in.hasNextDouble()) {
            System.out.println("Add a valid number: ");
            in = new Scanner(System.in);
        } b = in.nextDouble();

        System.out.println("Add side c of the triangle");
        in = new Scanner(System.in);
        while (!in.hasNextDouble()) {
            System.out.println("Add a valid number: ");
            in = new Scanner(System.in);
        } c = in.nextDouble();

        // Check if triangle is triangle.
        if (isTriangle(a, b, c)) { 
            System.out.println("A triangle can be made.");
        } else System.out.println("A triangle cannot be made.");
    }
}