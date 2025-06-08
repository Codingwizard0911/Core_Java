public class FactRecurssion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        System.out.println(fact1(n));
    }

    static int fact(int n)
    {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    static int fact1(int n)
    {
        int s=1;
        for(int i=1;i<=n;i++)
        {
            s = s*i;
        }
        return s;
    }
}
