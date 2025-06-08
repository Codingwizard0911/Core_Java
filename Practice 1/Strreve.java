import java.util.*;
public class Strreve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int n = str.length();
        StringBuilder rev = new StringBuilder();
       for(int i = n-1 ; i>=0 ; i--) 
       {
           rev.append(str.charAt(i));
       }
        System.out.println("The reversed string is : "+ rev);

    }
}
