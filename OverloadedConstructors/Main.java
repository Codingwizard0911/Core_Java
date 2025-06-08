package OverloadedConstructors;

public class Main {
    
    //Constructor Overloading ==> same name but different parameters
    public static void main(String[] args) {

        User user1 = new User("Spongebob", "spongebob@gmail.com");
        User user2 = new User("Spongebob", "spongebob@gmail.com", 20);

        System.out.println("Name: " + user1.name);
        System.out.println("Email: " + user1.email);
        System.out.println("Age: " + user1.age);
    }
}
