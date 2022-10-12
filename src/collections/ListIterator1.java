package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
	List<Integer> obj=new LinkedList <Integer>();
	obj.add(110);
	obj.add(120);
	obj.add(111);
	obj.add(106);
	obj.add(122);
	obj.add(116);
	obj.add(117);
	ListIterator l=obj.listIterator();
	while(l.hasNext()) {
		System.out.println(l.next());
	}
	System.out.println("===================================");
	
	while(l.hasPrevious()) {
	System.out.println(l.previous());
	
}
}
}