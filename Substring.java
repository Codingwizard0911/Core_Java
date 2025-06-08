import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        /*
         * .substring() ==> A method used to extract a substring from a string.
         * Syntax ==> stringName.substring(startIndex, endIndex);
         */
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        if(email.contains("@")){
        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1);
        System.out.println("The email is :" + email);
        System.out.println("The username is :" + username);
        System.out.println("The domain is :" + domain); 
    }

    else{
        System.out.println("❌Email Must Contain @");
    }
    
}
}
