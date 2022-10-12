package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(25);
		s.add(15);
		s.add(30);
		s.add(40);
		s.add(45);
		s.add(50);
		s.add(50);
		s.add(55);
		s.add(60);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(40));
		System.out.println(s.remove(15));
		System.out.println(s.contains(70));
		System.out.println(((HashSet)s).clone());
	}

}
