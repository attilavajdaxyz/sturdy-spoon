public class Vamp {
    public static void vamp() {
        String fruit = "jackfruit";
        int index = fruit.indexOf('a', 1);
        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }
        System.out.printf("Index of a is %s", index);
        System.out.println();
        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(2, 5));
        System.out.println(fruit.substring(6, 6));
    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {
        vamp();
        System.out.println(reverse("blablabla"));
    }
}
