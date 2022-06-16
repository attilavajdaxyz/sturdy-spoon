import java.util.ArrayList;

public class ToSquareRoot
{
  public static ArrayList<Integer> squareOrSquareRoot(int[] array)
  {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int i : array) {
      if ((Math.sqrt(i)) % 1 == 0) {
        result.add(i);
      }
    }
  }

  public static void main(String[] args) {
    squareOrSquareRoot({1, 2, 3});
  }
}