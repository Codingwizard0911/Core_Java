import java.util.*;
public class Main
{
    public static void main(String[] args) {
        //Array List ==>A resizable array that stores objects (autoboxing). 
        //Array are fixed in size but array list can change
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Mango");

        list1.remove(1);
        list1.set(1, "pineapple");
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        Collections.sort(list1);
        for(String fruit : list1)
        {
            System.out.println(fruit);
        }
        
    }
}