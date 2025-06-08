public class Precision 
 {
    public static void main(String[] args) {
        //printf() = is a formatted output statement that is used to print data on the screen.
        //%[flags][width][.precision][specifier-char]
        String name = "Spongybob Squarepants";
        int age = 30;
        double height = 22.55555555;
        boolean isEmployed = true;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Your name starts with a %c%n", name.charAt(0));
        System.out.printf("age %d: %n", age);
        System.out.printf("Your Height is %.1f%n", height);
        System.out.printf("You are %b%n", isEmployed);

        double price = 5000.50;
        System.out.printf("The price is %, .2f%n", price);
        
        /*0=zero padding
         * +:right justify
         * -:left justify
         */
        int n = 50;
        System.out.printf("%+d%n", n);  // Prints with a '+' sign
        System.out.printf("%-3d%n", n); // Left-justified with a width of 3
        System.out.printf("%,d%n", n);  // Prints with grouping separator (useful for large numbers)
        System.out.printf("%03d%n", n); // Zero-padded to a width of 3
    }
    
}
