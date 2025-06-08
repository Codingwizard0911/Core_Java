public class variables {
    //variable ==> a resuable container for a value, behaves as if it was the value it contains
    //Primitive ==> simple value sorted directly in memory(stack)
    /*Primitive data types:
     * byte, short, int, long, float, double, char, boolean
     */
    //non-primitive ==> reference(address) to an object in memory(heap)
    /*Non-primitive data types:
     * string, array, object, class, interface, enum
     */
    //Steps to creating a variable:
    //1. declare the variable
    //2. assign a value to the variable
    //3. use the variable
    public static void main(String[] args) {
        /*PRIMITIVE DATA TYPES */
        //1.Integer data type (4 bytes) (-2,147,483,648 to 2,147,483,647)
        int age;
        //declaration
        age = 21;
        //assignment
        System.out.println(age);
        int age2 = 20;
        //declaration and assignment
        System.out.println(age2);
        int quantity = 5;

        //2. Float data type (4 bytes) (-3.4028235E38 to 3.4028235E38) (8 digits after decimal point)
        System.out.println("The quantity is " + quantity);
        double price = 5.59;
        System.out.println("The price is " + price);
        double gpa = 8.5;
        System.out.println("the GPA is " + gpa);
      
        //3. character data type (2 bytes) (0 to 65,535)
        char grade = 'A';
        System.out.println("The grade is " + grade);

        //4. boolean data type (true or false) (1 bit)
        boolean isStudent = true;
        
        if (isStudent) {
            System.out.println("He is a student");
        }
        else
        {
            System.out.println("He is not a student");
        }

        //6.Byte data type (1 byte) (-128 to 127)
        byte num = 127;
        System.out.println(num);

        //7.Short data type (2 bytes) (-32768 to 32767)
        short num2 = 32767;
        System.out.println(num2);

        //8.Long data type (8 bytes) (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) (15 digits after decimal point)
        long num3 = 9223372036854775807L;
        System.out.println(num3);


        /*
         * Primitive data types 
         * size:
            * byte: 1 byte
            * short: 2 bytes
            * int: 4 bytes
             * long: 8 bytes
             * float: 4 bytes
             * double: 8 bytes
             * char: 2 bytes
             * boolean: 1 bit
         * range:
            * byte: -128 to 127
            * short: -32768 to 32767
            * int: -2,147,483,648 to 2,147,483,647
             * long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            * float: -3.4028235E38 to 3.4028235E38
            * double: -1.7976931348623157E308 to 1.7976931348623157E308
            * char: 0 to 65,535
            * boolean: true or false
         * default value:
            * byte: 0
             * short: 0
            * int: 0
            * long: 0
            * float: 0.0
            * double: 0.0
            * char: '\u0000'
            * boolean: false
        * float vs double:
            * float: 6 to 7 digits after decimal point
            * double: 15 digits after decimal point    
         * why we are using single quotes instead of double quotes for character data type:
            * because character data type is a single character
            * if double quotes are used, it will be a string
         * true vs false:
             * true: 1 bit
            * false: 1 bit
         * 
         * Where to use primitive data types:
            * when we want to store a single value
         */


        /*NON-PRIMITIVE DATA TYPES */
        //1. String data type (reference(address) to an object in memory(heap))(Sequence of characters)(0 to 65,535)(double quotes)(used for text)
        String name="John";
        System.out.println("Hi! I am " + name + " and I am a student\nNice to meet you");
        String food = "Pizza";
        System.out.println("Hi I like " + food + " So I become a" + name + " " + food + " Fan \nI secured a GPA around "+gpa+" in my last semester at my age of "+age+" years");
    }
}