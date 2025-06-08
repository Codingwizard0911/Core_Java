import java.util.Scanner;

public class Usersymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = sc.nextInt();

        System.out.print("Enter the Symbol to use: ");
        symbol = sc.next().charAt(0);

        for (int i = 0 ; i < rows ; i++)
        {
            for (int j = 0; j < columns ; j++)
            {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
