import java.util.*;
public class Squareofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(square(n));
    }
    static double square(int n){
        return (n*n);
    }
    
}
