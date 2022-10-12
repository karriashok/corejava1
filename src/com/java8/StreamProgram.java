package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> e=new ArrayList<Employee>();
		e.add(new Employee(110,"Ashok",30000));
		e.add(new Employee(120,"Rasheed",32000));
		e.add(new Employee(123,"Narendra",25000));
		e.add(new Employee(122,"Praveen",35000));
		e.add(new Employee(106,"Harsha",40000));
		e.add(new Employee(116,"Saikrishna",25000));
		
		/*Iterator <Employee> i=e.iterator();
		while(i.hasNext()){
		Employee ee=i.next();
		if(ee.getSalary()==30000) {
		System.out.println(ee.getEid()+" "+ee.getEname()+" "+ee.getSalary());*/
		List<Employee> l=e.stream().filter(x->x.getSalary()==32000).collect(Collectors.toList());
		l.forEach(t->System.out.println(t.getEid()+" "+t.getEname()+" "+t.getSalary()));

}
}
