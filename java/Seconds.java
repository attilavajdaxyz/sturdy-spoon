import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        int seconds;
        int hours;
        int minutes;
        Scanner in = new Scanner(System.in);
        System.out.print("Please add number of seconds: ");
        seconds = in.nextInt();

        // Calculating number of hours, minutes and seconds with remainder operator.
        hours = (seconds - (seconds % 3600)) / 3600;
        minutes = ((seconds - (hours * 3600)) - ((seconds - (hours * 3600)) % 60)) / 60;
        seconds = seconds - (3600 * hours) - (60 * minutes);
        System.out.printf("%d hours %d minutes and %d seconds", hours, minutes, seconds);
   }
}