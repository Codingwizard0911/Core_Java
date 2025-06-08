public class Palin {
    public static void main(String[] args) {
        String s = "Madam";
        s = s.toLowerCase();
        boolean flag = true;
        for(int i=0;i<=s.length()/2;i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    
}
