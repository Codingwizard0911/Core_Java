public class LeapYear {
 public static void main(String[] args) {
     int y = 2004;
     if(y%4 ==0)
     {
         if (y % 100 != 0 || y % 400 == 0)
             System.out.println("leap");
         else
             System.out.println("Not Leap");
     }
     else
     System.out.println("not leap");
 }   
}
