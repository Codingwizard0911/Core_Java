public class Stack {
    private int maxsize;
    private int[] stack;
    private int top = -1;

    public Stack(int size)
    {
        maxsize = size;
        stack = new int[maxsize];
        top = -1;
    }


    public void push(int data)
    {
        if (top == maxsize - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = data;
        }
    }
    


    public void pop(int data) {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--]);
        }

    }
    

    public void peek()
    {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top]);
        }
    }
        

    public void isEmpty()
    {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Stack is not empty");
        }

    }
    

    public void display()
    {
        if (stack.length == 0) {
            System.out.println("Stack Underflow");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    }


