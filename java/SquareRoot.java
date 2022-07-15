public class SquareRoot {
    public static double half(double a){
        return a / 2;
    }

    public static double improve(double xZero, double a){
        return (xZero + a/xZero) / 2;
    }

    public static double squareRoot(double a){
        double previousEstimate = half(a);
        double currentEstimate = improve(previousEstimate, a);
        while (Math.abs(previousEstimate - currentEstimate) > 0.0001) {
            previousEstimate = currentEstimate;
            currentEstimate = improve(previousEstimate, a);
        }
        return currentEstimate;
    }
    public static void main (String[] args) {
        System.out.println(squareRoot(36));
    }
}
