import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        // stack =  LIFO (Last In First Out)
        //          stores objects into a sort of "vertical tower"
        //          push() - adds an object to the top of the stack
        //          pop() - removes the object from the top of the stack

        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty()); // true

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack.peek()); // D (top of the stack)
        System.out.println(stack.search("D")); // 1 (counting from the top)
        System.out.println(stack.search("A")); // 4
        System.out.println(stack.search("Z")); // -1 (not found)

        stack.pop();
        stack.pop();

        System.out.println(stack); // [A, B]

        // Uses of stacks
        //      1. Undo/redo features in text editors
        //      2. moving back/forward through browser history
        //      3. backtracking algorithms (maze, file directories)
        //      4. calling functions (call stack)
    }
}
