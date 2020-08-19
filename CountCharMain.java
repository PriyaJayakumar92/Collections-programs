package HashMap_Impl;

import java.util.*;

class CountChar{
	
	public void checkString(String s) {
		
		if(s == null || s == "") {
			System.out.println("Input String is empty or null, please enter some string to process.");
			System.exit(0);
		}
	}
	
	public Map<Character,Integer> count(String s1){
		
		String s = s1.toLowerCase();
		char[] c = s.toCharArray();
		
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		
		for(int i=0;i<c.length;i++) {
			int j=1;
			if(m.containsKey(c[i])) {
				j = m.get(c[i]);
				m.replace(c[i],++j);
			}
			else
				m.put(c[i],j);
		}
		return m;
		
	}
	
	public void print(Map<Character,Integer> m1) {
		
		for(Map.Entry<Character,Integer> entry:m1.entrySet())
			System.out.println(entry.getKey()+" - "+entry.getValue());
	}
}

public class CountCharMain {

		public static void main(String[] args)
		{
			CountChar c = new CountChar();
			String s = "";
			c.checkString(s);
			Map<Character,Integer> m = c.count(s);
			c.print(m);
		}
	}


