class Node {
    int data;
    Node next;


    Node (int value)
    {
        data = value;
        next = null;
    }
}
public class LinkedListPractice {

    Node head;

    public void insert_at_beginning(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insert_at_begining(int value)
    {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void insert_at_anyposition(int value,int position)
    {
        Node newNode = new Node(value);
        if (position == 0) {
            insert_at_beginning(value);
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position Out of Bound");
        }

        else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    

    public void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void delete_by_value(int value)

    {
        Node temp = head;

        if (head == null) {
            head = head.next;
        }

        while (temp != null && temp.next.data != value) {
            temp = temp.next;

        }
        if (temp.next == null) {
            System.out.println("Value not found");
        }

        else {
            temp.next = temp.next.next;
        }

    }
    
    public boolean search(int value) {
        Node temp = head;
    
        while (temp != null) {
            if (temp.data == value) {
                return true; // value found
            }
            temp = temp.next;
        }
    
        return false; // value not found
    }
    

}
