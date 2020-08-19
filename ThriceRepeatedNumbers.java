package HashMap_Impl;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


class RepeatedFunc{
	
	public void repeatedFunc(int[] a) {
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(m.containsKey(a[i])) {
				int j=m.get(a[i]);
				m.replace(a[i],++j);
				//System.out.println(a[i]+"  "+m.get(a[i]));
			}
			else
				m.put(a[i],1);
		}
		Iterator itr = m.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,Integer> map =(Map.Entry<Integer,Integer>)itr.next();
			//int value = map.getValue();
			if(map.getValue()>2) 
				System.out.println(map.getKey()+"  "+map.getValue());
			
		}
	}
}

		
	


public class ThriceRepeatedNumbers {

	public static void main(String[] args) {
		RepeatedFunc r = new RepeatedFunc();
		int[] a= {1,2,2,4,2,1,1,2};
		r.repeatedFunc(a);
		

	}

}
