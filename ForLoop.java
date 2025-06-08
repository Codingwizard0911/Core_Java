import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for(init;cond;inc/dec){}
        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.println((i + 1) + " Pizzzzzzzzzzza");
        }
        
        System.out.println("How times you want to loop");
        int max = sc.nextInt();
        for (int i = 1; i <= max; i++)
        {
            System.out.println((i) + " Loop");
        }
    }
    
}
