public class Palindrome {
    public static void main(String[] args) {
        String str = "Abca";
        str = str.toLowerCase();
        boolean flag = true;
        for(int i=0; i<str.length()/2;i++)
        {
            if (str.charAt(i) != (str.charAt(str.length() - i - 1))) {
                flag = false;
            }
        }
        if(flag)
            System.out.println("palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
