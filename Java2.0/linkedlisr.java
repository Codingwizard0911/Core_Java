import java.util.LinkedList;
public class linkedlisr {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(1, 20);
        list.addFirst(25);
        list.addLast(27);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.getFirst();
        list.getLast();
        list.get(3);
        list.indexOf(2);
        list.contains(2);
        list.size();
        list.containsAll(java.util.Arrays.asList(1, 2, 3, 4, 5));
        list.isEmpty();
        list.clear();

    }
}
