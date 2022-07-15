public class Test {
    public static void main(String[] args) {
        char a = 'a';
        a++;
        char b = a++;
        String c = b + "" + 1;
        System.out.println(
            c
        );
    }
}