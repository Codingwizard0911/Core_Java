import java.util.*;

public class Primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i =2 ; i*i <= num ; i++)
        {
            if(num % i == 0)
            {
                System.out.println("Not prime");
                break;
            }
            else
            {
                System.out.println("prime");
                break;
            }
        }
        sc.close();
    }
    
}

