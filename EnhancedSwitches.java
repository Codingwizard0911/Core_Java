import java.util.Scanner;
public class EnhancedSwitches {
    public static void main(String[] args) {
        /*Difference Between Normal Switch and Enhanced Switch
         * Enhanced switch statements are more compact and readable than regular switch statements.
         * Enhanced switch statements are more efficient than regular switch statements.
         * Enhanced switch statements are more secure than regular switch statements.
         * Enhanced switch statements are more readable than regular switch statements.
         * Enhanced switch statements are more maintainable than regular switch statements.
         */
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day) {
            /*case ("Monday") -> System.out.println("Today is Weekday");
            case ("Tuesday") -> System.out.println("Today is Weekday");
            case ("Wednesday") -> System.out.println("This is a Weekday");
            case ("Thursday") -> System.out.println("This is a Weekday");
            case ("Friday") -> System.out.println("This is a Weekday");
            case ("Saturday") -> System.out.println("This is a Weekend");
            case ("Sunday") -> System.out.println("This is a Weekend");
            default -> System.out.println("Invalid day");*/
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("This is a Weekday");
            case "Saturday", "Sunday" -> System.out.println("This is a Weekend");
            default -> System.out.println("Invalid day");
        }

        //Normal Switch
        /*
         * switch (expression) {
         *     case value1:
         *         statement1;
         *         break;
         *     case value2:
         *         statement2;
         *         break;
         *     case value3:
         *         statement3;
         *         break;
         *     default:
         *         statement4;
         *         break;
         * }
         * example
         * switch (day) {
         *     case "Monday":
         *         System.out.println("Today is Monday");
         *         break;
         *     case "Tuesday":
         *         System.out.println("Today is Tuesday");         break;.....
         */

        /*Enhanced Switch
         * switch (expression) {
         *     case value1 -> statement1;
         *     case value2 -> statement2;
         *     case value3 -> statement3;
         *     default -> statement4;
         */
        /*Switch vs If else
         * Switch is more compact and readable than if-else.
         * Switch is more efficient than if-else.
         * Switch is more secure than if-else.
         * Switch is more readable than if-else.
         * Switch is more maintainable than if-else.
         */
    }
}