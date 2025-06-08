import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the Temperature");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius (C) or Fahrenheit (F)?");
        unit = sc.next().toUpperCase();

        System.out.println(temp + " " + unit);
        
        newTemp = unit.equals("C") ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
       
        System.out.println(newTemp + "°" + (unit.equals("C") ? "F" : "C"));

        sc.close();
    }
    
}
