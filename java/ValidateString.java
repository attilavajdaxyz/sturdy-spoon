public class ValidateString {
    public static boolean isCapitalized(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return Character.isUpperCase(str.charAt(0));
    }
    public static void main(String[] args) {
        System.out.println(isCapitalized("Hello")); // Thank you copilot.
        System.out.println("".isEmpty());
    }
}
