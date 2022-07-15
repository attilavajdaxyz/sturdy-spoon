public class Scrabble {
    public static boolean canSpell(String tiles, String word) {
        for (int i = 0; i < word.length(); i++){
            String currentLetter = "" + word.charAt(i);
            if (tiles.contains(currentLetter)) {
                tiles = tiles.replace(currentLetter, "");
            } else if (!tiles.contains(currentLetter)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canSpell("quijib", "jibo"));
    }
}
