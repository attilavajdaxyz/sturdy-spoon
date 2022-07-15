public class NoX {
    public static String noX(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            char first = str.charAt(0);
            String rest = str.substring(1);
            String recurse = noX(rest);
            if (first == 'x') {
                return recurse;
            } else {
                return first + recurse;
            }
        }
    }
    public static void main(String[] args) {
        noX("xaxb"); // "ab" 
    }
}
