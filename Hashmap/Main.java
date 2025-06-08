import java.util.HashMap;
public class Main
{
    public static void main(String[] args) {
        /*
         * Hashmap ==>A data structure that stores key value pairs
         *              Keys are unique but values can be duplicated
         *              Does not maintain any order but is memory efficient
         *              HashMap<key,value>
         */

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.remove("Orange");
        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsValue("1"));
        System.out.println(map.size());
        
        System.out.println(map);

        for (String key : map.keySet())
        {
            System.out.println(key + " " + map.get(key));
        }

    }
}