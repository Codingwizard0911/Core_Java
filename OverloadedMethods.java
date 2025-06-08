public class OverloadedMethods {
    public static void main(String[] args) {
        /*Overloaded Method ==> Method with same name but different parameters */
        System.out.println(add(1,2));
    }

    static double add(double a, double b){ //Overloaded Method
        
            return a+b;
        }

    static double add (int a, int b, int c){ //Overloaded Method
        {
            return a + b + c;
        }
        
    static double add(int a, int b, int c, int d) { //Overloaded Method
        return a + b + c + d;
    }
    
}
