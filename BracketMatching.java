package com.hashmap.exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class Matching {

	public void checkMatching(String s) {
		/*
		 * if(s.length()%2!=0) { System.out.println("Bracket not matching"); return; }
		 */
		Map<Character, Character> map = new HashMap<Character, Character>();
		Stack<Character> stack = new Stack<Character>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');
		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else if (map.get(stack.peek()) == s.charAt(i)) {
				stack.pop();
			} /*else {
				System.out.println("Bracket not matching");
				return;
			}*/

		}
		if(stack.size()>0) {
		System.out.println("Bracket not matching ");
		}
		else {
			System.out.println("Bracket  matching");
		}
		//System.out.println("Bracket  matching");

	}
}

public class BracketMatching {
	public static void main(String[] args) {
		Matching m = new Matching();
		m.checkMatching("{1}[23]");
	}
}
