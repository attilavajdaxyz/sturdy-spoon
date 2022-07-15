public class DoubloonArray {
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
    public static boolean doubloon(String s) {
        int[] counts = new int[26];
        printArray(counts);
        String lower = s.toLowerCase();
        // count the number of times each letter appears
        for (char letter : lower.toCharArray()) {
            System.out.print(letter - 'a');
            int index = letter - 'a';
            System.out.print(index);
            counts[index]++;
        printArray(counts);
        }
        // determine whether the given word is a doubloon
        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;  // not a doubloon
            }
        }
        return true;  // is a doubloon
    }
    public static void main(String[] args) {
        doubloon("aaaaaaaaabbccddee");
    }
}
