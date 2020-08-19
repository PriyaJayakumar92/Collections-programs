package HashMap_Impl;

import java.util.Map;
import java.util.HashMap;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		//int result =7;
		int prime = 31;
		int result =1;
		result = prime*result+ ((name!=null) ? name.hashCode():0 );
		result = prime*result+id;
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null || getClass()!=o.getClass())
			return false;
		if(o==this)
			return true;
		
		Student s = (Student) o;
		return this.id==s.id && this.name.equals(s.name);
}
}


public class OverrideHashFunc {

	public static void main(String[] args) {
	
		Student s1 = new Student(1,"Pri");
		Student s2 = new Student(2,"Sweet");
		Student s3 = new Student(3,"Ez");
		
		Map<Integer,Student> map = new HashMap<Integer,Student>();
		map.put(1,s1);
		map.put(2,s2);
		map.put(1,s3);
		
		for(Map.Entry<Integer,Student> e1 : map.entrySet()) {
			System.out.println("Key: "+e1.getKey());
		Student s = (Student) e1.getValue();
		System.out.println("Id: "+s.getId()+" Name: "+s.getName());
		}
	}

}
