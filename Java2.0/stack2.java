public class stack2 {
    private int size;
    private int[] stack;
    private int top = -1;
    
    public stack2(int size)
    {
        size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int data)
    {
        if (top == -1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = data;
        }

    }
    

    public void pop()
    {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--]);
        }
    }
    
    
}
