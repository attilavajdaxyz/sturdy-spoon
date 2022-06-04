public class Variables {
  public static void main(String[] args) {
    String something;
    String firstName;
    String lastName;
    int hour, minute;
    int x;

    String hello = "Hello";  // give message the value "Hello!"
    hour = 11;           // assign the value 11 to hour
    minute = 59;         // set minute to 59

    int a = 5;
    int b = a;     // a and b are now equal
    a = 3;         // a and b are no longer equal
    System.out.println(a);

    String firstLine = "Hello, again!";
    System.out.println(firstLine);

    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");

    System.out.print("Number of seconds since midnight: ");
    System.out.println(hour * 3600 + minute * 60);

    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(minute / 60);

    System.out.print("Percent of the hour that has passed: ");
    System.out.println(minute * 100 / 60);

    double pi;
    pi = 3.14159;

    double another_minute = 59.0;
    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(another_minute / 60.0);

    double y = 1.0 / 3.0;  // correct
  }
}
