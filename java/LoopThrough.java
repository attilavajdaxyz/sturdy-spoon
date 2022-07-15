public class LoopThrough {
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        printArray(a);
        int[] b = a;
        a[0] = 17;
        printArray(b);
        int[] c = new int[5];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        printArray(c);
    }
}
