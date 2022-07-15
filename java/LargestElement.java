public class LargestElement {
    public static int indexOfMax(int[] a){
        int result = 0;
        for (int num: a) {
            if (num > result) {
                result = num;
            }
        } return result;
    }
    public static void main(String[] args){
        int[] array = {1,2,3};
        System.out.println(indexOfMax(array));
    }
}