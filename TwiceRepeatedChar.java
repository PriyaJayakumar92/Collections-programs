package com.hashmap.exercise;

import java.util.HashMap;
import java.util.Map;

public class TwiceRepeatedChar {
	public static char twiceRepeatChar(char[] c) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < c.length; i++) {
			map.put(c[i], map.getOrDefault(c[i], 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				return entry.getKey();
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		char[] c = { 'a', 'c', 'e', 'a', 'b', 'c' };
		System.out.println("Char = " + TwiceRepeatedChar.twiceRepeatChar(c));
	}
}
