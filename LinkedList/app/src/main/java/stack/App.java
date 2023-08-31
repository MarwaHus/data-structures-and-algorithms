package stack;

public class App {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        System.out.println("Is stack empty? " + myStack.isEmpty());
        myStack.push("apple");
        myStack.push("banana");
        myStack.push("orange");
        System.out.println("Top value: " + myStack.peek());
        System.out.println("Is stack empty? " + myStack.isEmpty());
        while (!myStack.isEmpty()) {
            String value = myStack.pop();
            System.out.println("Popped value: " + value);
        }
        System.out.println("Is stack empty? " + myStack.isEmpty());
    }
}

