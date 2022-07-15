public class Abecedarian {
    public static boolean isAbecedarian(String word) {
        for (int i = 1; i < word.length(); i++){
            if (word.charAt(i) < word.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.println(isAbecedarian("abced"));
    }
}
