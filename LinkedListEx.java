package com.linkedlist.example;

class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
	}
}

public class LinkedListEx {
	
	public static void print(Node root) {
		while(root!=null) {
			System.out.println(root.value);
			root = root.next;
		}
		
	}
	
	public static int getLength(Node root) {
		int count=0;
		while(root!=null) {
			root = root.next;
			count++;
		}
		return count;
	}
	
	public static void middleNode(Node root) {
		int count=0;
		Node temp = root;
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		
		int middle = count/2;
		System.out.println("middle: "+middle);
		for(int i=0;i<middle;i++) {
			if(root!=null) {
				root=root.next;
			}
		}
		System.out.println("Middle element: "+root.value);
		
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		print(n1);
		System.out.println("length: "+getLength(n1));
		middleNode(n1);
	}
}
