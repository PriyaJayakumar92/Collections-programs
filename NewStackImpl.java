package Stack_Impl;

import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("hiding")
class RiyaStack<String> {
	int capacity;
	int top;
	List<String> list = new ArrayList<String>(capacity);

	public RiyaStack() {
		top = -1;
		capacity = 10;
	}

	public void push(String value) {
		if (top == capacity - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		list.add(++top, value);
	}

	public String pop() {
		if (top == -1) {
			// System.out.println("Stack underflow");
			return (String) "Stack underflow";
		}

		return list.remove(top--);
	}

	public String peek() {
		if (top == -1) {
			//System.out.println("Stack empty");
			return (String) "Stack empty";
		}

		return list.get(top);
	}

	public void display() {
		System.out.println("Stack Elements with size: " + list.size());
		for (String i : list)
			System.out.println(i);
	}
}

public class NewStackImpl {

	public static void main(String[] args) {
		RiyaStack<String> stack = new RiyaStack<>();
		stack.push("Hai");
		stack.push("Hello");
		System.out.println("Stack pop: " + stack.pop());
		System.out.println("Stack peek: " + stack.peek());
		System.out.println("Stack pop: " + stack.pop());
		System.out.println("Stack peek: " + stack.peek());

	}

}
