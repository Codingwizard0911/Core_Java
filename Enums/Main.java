package Enums;

import java.util.Scanner;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
         * Enums ==> Enumerations a special kind of class that represents a fixed set of constants.
         *           They improved Code readability and are easy to maintain
         *           More efficient with switches when comparing strings
         */
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Day of the WEEK : ");
String response = sc.nextLine().toUpperCase();
        
try {
    Day day = Day.valueOf(response);

    switch (day) {
       case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("IT is a WEEKDAY");
       case SATURDAY,SUNDAY -> System.out.print("It is the Weekend");
    }
} catch (IllegalArgumentException e) {
    System.out.println("Please Enter a valid day");
}
        
    }
    
}
