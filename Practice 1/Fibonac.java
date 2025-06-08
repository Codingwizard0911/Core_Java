public class Fibonac {
    public static void main(String[] args) {
        int n = 7, a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(Fibonac(n));
    }

    static int Fibonac(int n)
    {
        if (n==1)
            return 0;
        if (n==2)
            return 1;
        return Fibonac(n-1) + Fibonac(n - 2);
    }
}
