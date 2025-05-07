import java.util.Stack;

public class stackExample { // Class names should start with an uppercase letter
    public static void main(String[] args) {
        // Creating a Stack of Strings
        Stack<String> s = new Stack<>();

        // Pushing elements onto the stack (LIFO order)
        s.push("A");
        s.push("A");
        s.push("C");
        s.push("D");

        // Displaying the current contents of the stack
        System.out.println("Stack is: " + s);

        // Popping the top element ("D") from the stack
        s.pop();

        // Displaying the stack after pop operation
        System.out.println("Stack after pop is: " + s);
    }
}
