import java.util.*;
public class Eexception {
    public static void main(String[] args) {
        //Exception ==> And event that interrupts the normal flow of program 
        //(dividing by zero ,file not found, mismatch input type)
        // surround any dangerous code with a try block and try{} catch{} and finally{}
        Scanner sc = new Scanner(System.in);
      try {
        System.out.print("Enter a #");
        int number = sc.nextInt();
        System.out.print(number);
    } catch (Exception e) {
        System.out.println("Something Went Wrong");
      }
       

    }
    
}
