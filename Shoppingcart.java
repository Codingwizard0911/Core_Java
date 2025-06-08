import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        double price=99.9;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? : ");
        item = sc.nextLine();
        System.out.print("Price of the item : "+currency +" "+ price );
        System.out.print("What is the quantity? : ");
        quantity = sc.nextInt();
        total = price * quantity;
        System.out.print("Total cost : " +currency + " " + total);
        System.out.print("\nYou bought " + quantity + " " + item + " for " + currency+ " " + total);
        System.out.println("Visit again ");
        sc.close();
    }
}
