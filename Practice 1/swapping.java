public class swapping {
    public static void main(String[] args) {
        int fno = 21; int sno = 10; 
        fno += sno;
        sno = fno - sno;
        fno -= sno;
        System.out.println("First number is : " + fno + "\nSecond number is : " + sno);
    }
    
}
