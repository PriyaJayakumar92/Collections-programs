

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id =id;
		this.name=name;
	}
	
	
	/*public int compareTo(Student s1)
	{
		if(id==s1.id)
			return 0;
		else if(id<s1.id)  //descend id
			return 1;
		else
			return -1;
	}*/
	
	
	/*public int compareTo(Student s1)
	{
		if(id==s1.id)
			return 0;
		else if(id>s1.id)  //ascend id
			return 1;
		else
			return -1;
	}*/
	
	public int compareTo(Student s1)
	{
		return name.compareTo(s1.name);  //sort by name
		
	}
	
}

public class Collection_Sort_Comparable {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(10,"Ezhilan"));
		al.add(new Student(11,"Priya"));
		al.add(new Student(12,"Riya"));
		
		Collections.sort(al);
		
		for(Student st:al)
			System.out.println("id= "+st.id+"  name= "+st.name);
		
		
		
	}

}
