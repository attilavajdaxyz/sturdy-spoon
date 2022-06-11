public class PrintTwice {

    public static void printTwice(String string) {
        System.out.println(string);
        System.out.println(string);
    }
    
    public static void printTime(int hours, int minutes) {
        System.out.print(hours);
        System.out.print(":");
        System.out.println(minutes);
    }

    public static void main(String[] args) {
        printTwice("Don't make me say this twice!");
        String message = "Some message";
        printTwice(message);
        int hour = 8;
        int minutes = 45;
        printTime(hour, minutes);
    }
}