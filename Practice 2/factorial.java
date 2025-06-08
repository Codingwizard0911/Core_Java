public class factorial {
    public static void main(String[] args) {
        int fact = 5, f = 1;
        for (int i = 1; i <= fact; i++) {
            f *= i;
        }
        System.out.println(f);
        System.out.println(facto(fact));
    }
   static int facto(int fact) {
        if (fact == 1 || fact == 0) {
            return 1;
        }
        return fact * facto(fact - 1);
    }
}
