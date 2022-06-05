import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float temperatureInCelsius;
        float temperatureInFahrenheit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        temperatureInCelsius = in.nextFloat();
        temperatureInFahrenheit = temperatureInCelsius * 9 / 5 + 32;
        System.out.printf("%.1fC = %.1fF", temperatureInCelsius, temperatureInFahrenheit);
    }
 }