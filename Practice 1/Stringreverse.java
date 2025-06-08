import java.util.*;
class Stringreverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the String : ");
        StringBuilder rev = new StringBuilder();
        String str = sc.nextLine();
        int n = str.length();
        for(int i= n-1; i>=0;i--)
        {
            rev.append(str.charAt(i));
        }
        rev.toString();
        System.out.println("Reversed String : "+ rev );
    }
}