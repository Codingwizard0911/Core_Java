import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        float base = 0, height = 0, area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base of the Triangle : ");
        base = sc.nextFloat();
        System.out.print("Enter the height of the Triangle:");
        height = sc.nextFloat();
        area=(base*height)/2;
        System.out.println("The area of the triangle is: " + area+"cm²");
    }
    
}
