public class Recurse {
    // I cannot do it at the moment. But I can do it for process.
    public static void printString(String s){
        if (length(s) == 1) {
            System.out.println(first(s));
        } else if (length(s) > 1) {
            System.out.println(first(s));
            printString(rest(s));
        }
    }
    public static void printBackward(String s) {
        if (length(s) == 1) {
            System.out.print(s);
        } else {
            printBackward(rest(s));
            System.out.print(first(s));
        }
    }
    public static String reverseString(String s) {
        if (length(s) == 0) {
            return "";
        } else {
            String recurse = reverseString(rest(s));
            String result = recurse + first(s);
            return result;
        }
    }
    public static boolean isPalindrome(String s) {
        String firstLetter = "" + first(s);
        String firstLetterOfReverse = "" + first(reverseString(s));
        boolean isOneOrZeroFlag = (length(s) == 1 || length(s) == 0);
        boolean isTwoEqualFlag = (length(s) == 2 && firstLetter.equals(firstLetterOfReverse));
        boolean isTwoNotEqualFlag = (length(s) == 2 && !firstLetter.equals(firstLetterOfReverse));
        boolean longerThanTwoAndSidesNotEqualFlag = (length(s) > 2 && !firstLetter.equals(firstLetterOfReverse));

        // Base case.
        if (isOneOrZeroFlag || isTwoEqualFlag) {
            return true;
        } else if ( isTwoNotEqualFlag || longerThanTwoAndSidesNotEqualFlag ) {
            return false; 
        } else {
            return isPalindrome(middle(s));
        }
    }
    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }
    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }
    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }
    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }
    public static void main(String[] args){
        // System.out.println(first("abcdef")); // Testing first.
        // System.out.println(rest("abcdef"));
        // System.out.println(middle("abcdef"));
        // System.out.println(length("abcdef"));
        // printString("abcdefgahc");
        // printBackward("abcdefgahc");
        // String backwards = reverseString("coffee");
        // System.out.println(backwards);
        System.out.println(isPalindrome("emoome"));
    }

}
