public class Alphabet {
    public static void roman(){
        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();
    }
    public static void greek(){
        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        roman();
        greek();
    }
}
