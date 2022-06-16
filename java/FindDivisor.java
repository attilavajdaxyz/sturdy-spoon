import java.util.stream.IntStream;

public class FindDivisor {
  public static long numberOfDivisors(int n) {
    return IntStream.range(1, n+1).filter(i -> n%i==0).count();
  }

  public static void longolon() {
    IntStream soup = IntStream.range(1, 5);
    System.out.printf("Intstreamisrange? %s", soup);
  }
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(numberOfDivisors(5));
    longolon();
  }
}

