public class TelephoneKeypad {
    public static void main(String[] args) {
        char[][] telephonic = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        // Print the telephone keypad using enhanced for loop
        for(char[] row: telephonic)
        {
            for (char number : row)
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

