public class OfBeer {
    public static void ofBeer(int n) {
        if (n == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!"); 
        } else {
            System.out.printf("%d bottles of beer on the wall,", n);
            System.out.println();
            System.out.printf("%d bottles of beer,", n);
            System.out.println();
            System.out.printf("ya’ take one down, ya’ pass it around,");
            System.out.println();
            System.out.printf("%d bottles of beer on the wall.", n);
            System.out.println();
            ofBeer(n - 1);
        }
    }
    public static void main(String[] args) {
        ofBeer(3);
    }
}
