public class Methods {
  
    public static void main(String[] args) {
        //methods ==> a block of code that is used to perform a specific task
        //methods ==> used to reduce the code complexity

        String name = "Joe";
        int age = 21;
        for (int i = 0; i < 3;i++)
            happyBirthday(name,age);
    }

    static void happyBirthday(String name, int age)
    {
        System.out.println("Happy Birthday " + name + " you are " + age + " years old");
        System.out.println("Have a nice day");
        System.out.println("Wish you all the best");
        System.out.println("Happy Birthday");
    }
    
}
