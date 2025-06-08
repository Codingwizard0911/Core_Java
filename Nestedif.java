public class Nestedif {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You are a student and a senior, you get a 30% discount");
                price *= 0.7;
            } else {
                System.out.println("You are a student, you get 10% discount.");
                price *= 0.9;
            }
            System.out.printf("The price of the ticket %.2f%n", price);
        } else {
            if (isSenior) {
                System.out.println("You are a senior, you get a 20% discount.");
                price *= 0.8;
            }
        }

    }
}
