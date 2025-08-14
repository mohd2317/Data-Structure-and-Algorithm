package List.Stack;

import java.util.Stack;

public class Basic_Program {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("After push: " + stack); //[Apple, Banana, Cherry]

        // Peek (view top element without removing)
        System.out.println("Peek: " + stack.peek()); //Cherry

        // Search element (1-based position from top)
        System.out.println("Search 'Banana': " + stack.search("Banana")); //2
        System.out.println("Search 'Mango': " + stack.search("Mango")); // -1 if not found

        // Pop element (removes top)
        System.out.println("Popped: " + stack.pop()); //Cherry
        System.out.println("After pop: " + stack);    //[Apple, Banana]

        // Empty check
        System.out.println("Is empty? " + stack.empty()); //false

        // Iterate (LIFO order)
        System.out.println("Iterating stack:");
        for (String item : stack) {
            System.out.println(item);          //Apple Banana
        }

        // Pop all elements
        while (!stack.empty()) {
            System.out.println("Popping: " + stack.pop()); //Banana //Apple
        }
        System.out.println("Is empty now? " + stack.empty()); //true
    }
}

/*
Q: Difference between Stack and ArrayDeque?
A: Stack is synchronized (slower), ArrayDeque is faster but not thread-safe.

Q: Is Stack part of Java Collections Framework?
A: Yes, it implements List through Vector.

Q: Why Stack extends Vector?
A: Historical design — Stack was added in Java 1.0 before the Collections framework.

Q: Which class is preferred for stack operations today?
A: ArrayDeque (unless thread safety is required).
 */