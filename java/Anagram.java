import java.util.Arrays;

public class Anagram {  
    public static boolean isAnagram(String a, String b){
        int[] aHist = letterHist(a);
        int[] bHist = letterHist(b);
        
        // Traversing the histogram of string a
        for (int i = 0; i < aHist.length; i++) {
            if (aHist[i] != bHist[i]) {
                return false;
            }
        }
        return true;
    }
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
        String oneString = "anagram";
        String anotherString = "anagram";
        boolean result = isAnagram(oneString, anotherString);
        System.out.println(result);
    }
}

