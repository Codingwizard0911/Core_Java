import java.util.Stack;

public class stack221 
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        stack.isEmpty();
        stack.peek();
        stack.search(3);
        stack.size();
        stack.clear();
    }
    
}
