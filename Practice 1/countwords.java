public class countwords {
    public static void main(String[] args) {
        String str = " Hello this is java";
        String[] strarr = str.trim().split("\\s+");
        System.out.println(strarr.length);
    }
    
}
