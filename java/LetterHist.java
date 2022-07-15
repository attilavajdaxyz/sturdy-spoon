import java.util.Arrays;

public class LetterHist {
    public static void printArray(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i] + "}");
            } else
            System.out.print(a[i] + ",");
        }
    }
    public static int[] letterHist(String str) {
        int[] result = new int[26];
        Arrays.fill(result, 0);
        
        for (int i = 0; i < str.length(); i++) {
            int numOfChar = str.charAt(i) - 97;
            if (numOfChar >= 0 && numOfChar <= 25) {
                result[numOfChar]++;
            }
        }
        return result;
    }
    public static void main (String[] args) {
        String str = "this is a string of characters";
        printArray(letterHist(str));
    }
}
