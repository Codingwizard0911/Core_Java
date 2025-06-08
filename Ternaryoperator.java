import java.util.Scanner;

public class Ternaryoperator 
{
 public static void main(String[] args) {
    /*ternary operator ==> a conditional operator that takes three operands: a condition, 
    * a value to be returned if the condition is true, and a value to be returned if the condition is false.`
    * Syntax ==> (condition) ? (value if true) : (value if false); 
    */ 
    int score = 75;
    String passOrFail = (score > 70) ? "Pass" : "Fail";
    System.out.println(passOrFail);
    
    int number = 4;
    String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
    System.out.println(evenOrOdd);

    int a = 5, b = 10, c = 15;
    int max = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;
    System.out.println(max);
 }   
}
