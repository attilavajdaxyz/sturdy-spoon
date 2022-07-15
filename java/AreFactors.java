public class AreFactors {
    public static boolean areFactors(int n, int[] a) {
        for (int e: a) {
            if (n % e != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //CRAFTSMANSHIP
        int a[] = {2, 4};
        int n = 8;
        System.out.println(areFactors(n, a));
    }
}
