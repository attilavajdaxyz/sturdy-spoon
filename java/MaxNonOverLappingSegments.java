public class MaxNonOverLappingSegments {
    public static int maxNonOverLappingSegments(int[] A, int[] B) {
        int n = A.length;
        int[] count = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            count[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && B[i] > B[j]) {
                    count[i] = Math.max(count[i], count[j] + 1);
                }
            }
            max = Math.max(max, count[i]);
        }
        return max;
    }
}