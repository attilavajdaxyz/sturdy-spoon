public class Date {
    public static void printAmerican(String day, String date, String month, int year){
        System.out.print("American format: ");
        System.out.print(day + ", ");
        System.out.print(month + " ");
        System.out.print(date + ", ");
        System.out.print(year + "\n"); 
    }

    public static void printEuropean(String day, String date, String month, int year){
        System.out.print("European format: ");
        System.out.print(day + " ");
        System.out.print(date + " ");
        System.out.print(month + " ");
        System.out.print(year + "\n");
    }

    public static void main(String[] args) {
        // generate some simple output
        System.out.println("Hello, World!"); // first line

        printAmerican("Friday", "3rd", "June", 2022);
        printEuropean("Friday", "3rd", "June", 2022);
    }

}
