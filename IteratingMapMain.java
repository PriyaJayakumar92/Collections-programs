package HashMap_Impl;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;

class IteratingMap {
	
	public void iterateMapEntry(Map<String,String> m) {
		
		System.out.println("**Using iterator on Map.Entry");
		Iterator itr = m.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String,String> e = (Map.Entry<String,String>)itr.next();
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		}
		
		System.out.println("**Using for-each loop on Map.Entry");
		for(Map.Entry<String,String> e1 : m.entrySet())
			System.out.println("Key: "+e1.getKey()+" Value: "+e1.getValue());
			
	}
	
	public void iterateKey(Map<String,String> m) {
		System.out.println("**Using iterator on keySet");
		Iterator itr = m.keySet().iterator();
		while(itr.hasNext()) {
			String key = (String)itr.next();
			System.out.println("Key: "+key+" Value: "+m.get(key));
	}
		System.out.println("**Using for-each loop on keySet");
		for(String key : m.keySet())
			System.out.println("Key: "+key+" Value: "+m.get(key));
			
}
	
	public void iterateValues(Map<String,String> m) {
		System.out.println("**Using Iterator on Collection.values");
		Collection c = m.values();
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**Using for-each loop on Collection.values");
		for(String value : m.values()) 
			System.out.println("Value: "+value);
		
	}
	
	public void setDifferentValue(Map<String,String> m,String s1,String s2) {
		m.put(s1,s2);
		System.out.println("Key: "+s1+" Value: "+m.get(s1));
		
		m.replace(s1, "riyarose");
		System.out.println("Key: "+s1+" Value: "+m.get(s1));
	}
}


public class IteratingMapMain {

	public static void main(String[] args) {
		
		IteratingMap i = new IteratingMap();
		
		Map<String,String> m1 = new HashMap<String,String>();
		m1.put("1","priya");
		m1.put("2","riya");
		m1.put("3","ezhilan");
		m1.put("4","vijay");
		m1.put("5","nithya");
		
		i.iterateMapEntry(m1);
		i.iterateKey(m1);
		i.iterateValues(m1);
		i.setDifferentValue(m1,"2","riyasweet");
	}

}
