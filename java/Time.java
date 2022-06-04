public class Time {
    public static void main (String[] args) {
        System.out.println("Hello world!");
        int hour = 19;
        int minute = 8;
        int second = 30;
        float secondsInDay = 24 * 3600;
        float secondsPassed = hour * 3600 + minute * 60 + second;
        System.out.print("Number of seconds since midnight: ");
        System.out.println(secondsPassed);
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(secondsInDay - (hour * 3600 + minute * 60 + second));
        System.out.print("Percentage of day that has passed: ");
        System.out.println(secondsPassed / secondsInDay * 100);

        int currentHour = 19;
        int currentMinute = 25;
        int currentSecond = 15;
        System.out.print("Time passed since starting this exercise: ");
        System.out.print(currentHour - hour);
        System.out.print("hours ");
        System.out.print(currentMinute - minute);
        System.out.print("minutes ");
        System.out.println(currentSecond - second);
        System.out.print("seconds");
    }
}