package CollectionLinkedList;

import java.util.LinkedList;

public class StackUsingLinkedList {

	LinkedList<Integer> stack;

	public StackUsingLinkedList() {
		stack = new LinkedList<>();
	}

	public void push(int value) {
		stack.addFirst(value); // Add at the beginning (top of stack)
	}

	public int pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty");
			return -1; // Indicates empty stack
		}
		return stack.removeFirst(); // Remove from the beginning (top of stack)
	}

	public int peek() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty");
			return -1; // Indicates empty stack
		}
		return stack.getFirst(); // Peek the top element
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Top of stack: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Top of stack after pop: " + stack.peek());

	}

}
