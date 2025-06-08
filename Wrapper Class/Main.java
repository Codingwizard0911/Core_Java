package Wrapper Class;

public class Main {
    public static void main(String[] args) {
        /*
         * Wrapper Classes ==> Allow primitive values int, char, double, boolean
         * To be used as object. wrap them in an object
         * Generally, don't wrap primitive unless you need an object
         * Allows use of Collections Framework and static Utility Methods
         */

         /*Integer a = new Integer(123);
         Double b =  new Double (3.14);
         char c = new Character('A');
         boolean d = new Boolean (true);*/

         //Autoboxing Methods
         Integer a = 123;
         Double b = 3.14;
         Character c = '&';
         Boolean d= true;

         //Unboxing
         int x=a;
         //taking wrapper objective and back to primitive
         
         String n = Integer.toString(123),  //.toString(),.parseInt(),parseDouble(),charAt(0),parseBoolean();
                 m=Double.toString(3.14),
                         p=Character.toString('c'),
                                 o=Boolean.toString(true);
        
            String z=n+m+o+p;
            System.out.println(z);

        //Character.isletter(letter) ==> returns true or false
     } // Character.isUpperCase() ==>  returns true or false
    
}
