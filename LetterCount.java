package com.hashmap.exercise;

import java.util.Map;
import java.util.HashMap;

class Logic{
	public void count(String s) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i),1);
			}
				
		}
		for(Map.Entry<Character,Integer> m:map.entrySet()) {
		System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
	}
}

public class LetterCount {
public static void main(String[] args) {
	Logic l = new Logic();
	l.count("Tree");
}
}
