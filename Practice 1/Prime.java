public class Prime {
    public static void main(String[] args) {
       int n = 225000000;
        boolean flag = true;
        for(int i=2;i*i<=n;i++)
        {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
