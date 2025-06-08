import java.util.*;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int numofDice;
        int tot = 0;

        System.out.println("Enter the # of dice to roll");
        numofDice = sc.nextInt();

        if(numofDice>0)
        {
            for(int i=0;i<numofDice;i++)
            {
                int roll = rc.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                tot += roll;
            }
            System.out.println("Total rolled: " + tot);
        }
        else {
            System.out.println("# of dice must be greater than 0");
        }
    }

    static void printDie(int roll)
    {
        String dice1= """
                +-----+
                |     |
                |  *  |
                |     |
                +-----+
                """;
        String dice2= """

        +-----+
        |*    |
        |     |
        |    *|
        +-----+
        """;
        String dice3= """
                +-----+
                |*    |
                |  *  |
                |    *|
                +-----+
                """;
        String dice4= """
                +-----+
                |*   *|
                |     |
                |*   *|
                +-----+
                """;
        String dice5= """
                +-----+
                |*   *|
                |  *  |
                |*   *|
                +-----+
                """;
        String dice6= """
                +-----+
                |*   *| 
                |*   *|
                |*   *| 
                +-----+
                """;

        switch(roll)
        {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Error");
        }
    }
}

