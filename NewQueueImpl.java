package Queue_Impl;

import java.util.List;
import java.util.ArrayList;

class RiyaQueue<E> {
	int capacity;
	int front, rear;
	List<E> list = new ArrayList<>(capacity);

	public RiyaQueue() {
		front = rear = -1;
		capacity = 10;
	}

	public void insert(E value) {
		if (rear == capacity - 1) {
			System.out.println("Queue Overflow");
			return;
		}
		if (rear == -1) {
			front++;
			rear++;
			list.add(value);
		} else {
			rear++;
			list.add(value);
		}
	}

	public E delete() {
		if (front == -1) {
			System.out.println("Queue Onderflow");
			return null;
		}
		if (front == capacity) {
			front = rear = -1;
			System.out.println("Queue Empty");
			return null;
		}
		if (front == rear) {
			E i = list.get(front);
			if ((int)i != 0) {
				return list.remove(front);
			} else {
				System.out.println("Queue empty");
				return null;
			}
		}

		return list.remove(front++);
	}

	public void display() {
		// System.out.println("Queue Elements with size: "+list.size());
		for (E i : list)
			System.out.println(i);
	}
}

public class NewQueueImpl {

	public static void main(String[] args) {
		RiyaQueue<Integer> queue = new RiyaQueue();
		queue.insert(10);
		queue.insert(20);
		System.out.println("Queue removed:" + queue.delete());
		queue.display();
		System.out.println("Queue removed:" + queue.delete());
		queue.display();
	}

}
