package HashMap_Impl;
import java.util.Map;
import java.util.HashMap;
//import java.util.function.BiFunction;

class Anagram {
	
	public boolean checkAnagram(String s1,String s2) {
		
		if(s1==null || s1.isEmpty() || s2==null ||s2.isEmpty()) {
			System.out.println("Entered String is null or empty");
			System.exit(0);
		}
		else if(s1.length()!=s2.length()) {
			System.out.println("Entered Strings length mismatch");
			System.exit(0);
		}
		
		s1 += s2;
		char[] c = s1.toLowerCase().toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		
		for(int i=0;i<c.length;i++) {
			int j=1;
			if(m.containsKey(c[i])) {
				m.compute(c[i],(k,v) -> v+1);
			}
			else
				m.put(c[i],j);
		}
		
		
		for(Map.Entry<Character,Integer> e:m.entrySet()) {
			if(e.getValue()%2!=0)
				return false;
		}
		return true;
		
		
	}
	
}

public class AnagramMain {

	public static void main(String[] args) {
		
		Anagram a = new Anagram();
		String s1= "Listem";
		String s2= "Silent";
		System.out.println("Are the two strings "+s1+" and "+s2+" are Anagram = "+a.checkAnagram(s1,s2));
	}

}
