
public class duplicates {
    public static void main(String[] args) {
        String str = "abcadafcads";
        String rev = "";
        for(int i=0;i<str.length();i++)
        {
            char curr = str.charAt(i);
                if(!rev.contains(String.valueOf(curr)))
                {
                    rev += curr;
                }
            
        }
        System.out.println(rev);
    }
}
