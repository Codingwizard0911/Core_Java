import java.util.Random;

public class Randomclass {
    public static void main(String[] args) {
        //random class is used to generate random numbers
        Random random = new Random();
        int number;
        number = random.nextInt(1, 10);
        System.out.println(number);
        float number1;
        number1 = random.nextInt(1, 100);
        System.out.println(number1);
        double number2;
        number2 = random.nextInt(1, 1000);
        System.out.println(number2);
        long number3;
        number3 = random.nextInt(1, 10000);
        System.out.println(number3);
        boolean ishead;
        ishead = random.nextBoolean();
        if (ishead) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
        /* You can generate the integer, double, float, long, boolean */
    }
}
