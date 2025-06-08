public class StringMethod {
    public static void main(String[] args) {
        String name = "John Doe";
        int length = name.length();
        System.out.println("The number of characters in the String is " + length);
        char letter = name.charAt(0);
        System.out.println("Your name starts with " + letter);
        int index = name.indexOf('O');
        System.out.println("The Letter O is found at index " + index);
        int lindex=name.lastIndexOf('O');
        System.out.println("The Last index of the letter O is " + lindex);
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim(); // removes spaces from the beginning and end of the string;
        name = name.replace('D', 'J');
        if (name.isEmpty())
        {
            System.out.println("The String is empty");
        }
        else{
            System.out.println("Your name is "+name);
        }
        if (name.contains(" "))
        {
            System.out.println("Your name contains a space");
        }
        else
        {
            System.out.println("Your name does not contain a space");
        }
        if (name.equals("password"))
        {
            System.out.println("Your name  cannot be password");
        }
        else{
            System.out.println("Your name can be password");
        }
    }
    
}
