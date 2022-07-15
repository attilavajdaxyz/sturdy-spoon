import java.util.Arrays;

public class Arrayas {
    public static void main(String[] args) {
        double[] a = new double[3];
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        double[] c = Arrays.copyOf(a, a.length);
    }
}
