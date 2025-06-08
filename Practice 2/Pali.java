public class Pali {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        boolean flag = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
