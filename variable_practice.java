public class variable_practice {
    /*String name="John"
     * int age=21
     * char gender='M'
     * boolean isMarried=true
     * double salary=50000.50
    */
    public static void main(String[] args) {
        String name = "John";
        int age = 21;
        char gender = 'M';
        boolean is_Married = true;
        double salary = 50000.50;
        if (is_Married) {
            System.out.println(name + " is married");
            System.out.println("He is " + age + " years old");
            System.out.println("He earns around " + salary + " per month");
            System.out.println("He is a " + gender);
        }
    }
}