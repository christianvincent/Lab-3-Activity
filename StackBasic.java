public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;
    
    // constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }
    
    // Add element to top of stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full, cannot push element");
            return;
        }
        top++;
        stackArray[top] = value;
    }
    
    // Remove element from top of stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty, cannot pop element");
            return;
        }
        top--;
    }
    
    // Return top of stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty, cannot peek element");
            return -1;
        }
        return stackArray[top];
    }
    
    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}
