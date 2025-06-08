package Static;

public class Main {
    public static void main(String[] args) {
        //static ==> static variables and static methods
        //static ==> belongs to the class not to the object
        //static ==> can be accessed without creating an object
        //used to create utility methods or shared resources

        Friend friend1 = new Friend("John", 20);
        Friend friend2 = new Friend("Jane", 22);
        Friend friend3 = new Friend("Bob", 19);
        Friend friend4 = new Friend("Alice", 21);

        System.out.println(Friend.numOfFriends);
        System.out.println("Friend 1: " + friend1.Name + " " + friend1.age);
        System.out.println("Friend 2: " + friend2.Name + " " + friend2.age);
        System.out.println("Friend 3: " + friend3.Name + " " + friend3.age);
        System.out.println("Friend 4: " + friend4.Name + " " + friend4.age);
        Friend.showFriendsMethod();
    }
    
}
