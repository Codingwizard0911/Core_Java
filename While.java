import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        while(name.isEmpty())
        {
            System.out.println("Enter Your name: ");
            name = sc.nextLine();
        }
        System.out.println("name : "+name);
    }
    
}
