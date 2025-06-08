package Static;


public class Friend {

   static int numOfFriends;
    String Name;
    int age;

    Friend(String Name,int age)
    {
        this.Name = Name;
        this.age = age;
        ++numOfFriends;
    }

    static void showFriendsMethod()
    {
        System.out.println("You have "+numOfFriends+" friends");
    }
    
}
