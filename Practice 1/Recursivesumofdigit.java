public class Recursivesumofdigit {
    public static void main(String[] args) {
        int num = 5401;
        int result = Sumofdigit(num);
        System.out.println(result);
    }

    static int Sumofdigit(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10) + Sumofdigit(n / 10);
    }
}
