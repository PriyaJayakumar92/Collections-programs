

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class Employee
{
	int id;
	String name;
	int age;
	
	Employee(int id,String name,int age)
	{
		this.id =id;
		this.name=name;
		this.age=age;
	}
	
	int getAge() {
		return age;
	}
}

class NameComparator implements Comparator<Employee>
{

	public int compare(Employee e1,Employee e2)
	{
		return e1.name.compareTo(e2.name);
	}
}

class IdComparator implements Comparator<Employee>
{

	public int compare(Employee e1,Employee e2)
	{
		if(e1.id==e2.id)
			return 0;
		else if(e1.id<e2.id)   //descend id
			return 1;
		else 
			return -1;
	}
}

public class Collection_Sort_Comparator {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101,"Ez",22));
		al.add(new Employee(102,"Pri",24));
		al.add(new Employee(103,"Ri",16));
		
		Collections.sort(al,new NameComparator());
		for(Employee e:al)
		System.out.println("id= "+e.id+"  name= "+e.name+"  age= "+e.age);
		
		Collections.sort(al,new IdComparator());
		for(Employee e:al)
		System.out.println("id= "+e.id+"  name= "+e.name+"  age= "+e.age);
		
		Comparator<Employee> c = Comparator.comparing(Employee::getAge);
		Collections.sort(al,c);
		for(Employee e:al)
			System.out.println("id= "+e.id+"  name= "+e.name+"  age= "+e.age);

	}

}
