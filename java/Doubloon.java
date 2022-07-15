public class Doubloon {
    public static boolean isDoubloon(String word){
        for (int i = 0; i < word.length(); i++){
            String currentI = "" + word.charAt(i);
            String letterCount = "";
            for (int j = 0; j < word.length(); j++){
                String currentJ = "" + word.charAt(j);
                if (currentI.equals(currentJ)) {
                    letterCount += currentJ;
                }
            } if (letterCount.length() != 2) { 
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isDoubloon("aabbccddee"));
        System.out.println(isDoubloon("abcdefgh"));
    }
}
