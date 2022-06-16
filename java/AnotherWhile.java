public class AnotherWhile {
    public static void appreciate() {
        int i = 2;
        while (i <= 8) {
            System.out.print(i + ", ");
            i += 2;  // add 2 to i
        }
        System.out.println("Who do we appreciate?");
    }

    public static void prom(){
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;  // add 1 to i
        }
        appreciate();
        prom();
    }
}