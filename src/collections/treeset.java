package collections;

import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		Set <Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(11);
		t.add(20);
		t.add(22);
		t.add(25);
		t.add(30);
		t.add(42);
		t.add(16);
		t.add(28);
		t.add(32);
		t.add(45);
		System.out.println("\nTreeSet : ");
		System.out.println(t);
		System.out.println("\n first--------"+((TreeSet) t).first());
		System.out.println("\n last--------"+((TreeSet) t).last());
		System.out.println("\n lower--------"+((TreeSet) t).lower(22));
		System.out.println("\n floor--------"+((TreeSet) t).floor(11));
		System.out.println("\n ceiling--------"+((TreeSet) t).ceiling(30));
		System.out.println("\n higher--------"+((TreeSet) t).higher(10));
		System.out.println("\n pollFirst--------"+((TreeSet) t).pollFirst());
		System.out.println("\n pollLast--------"+((TreeSet) t).pollLast());
		System.out.println("\n subSet--------"+((TreeSet) t).subSet(20,32));
		System.out.println("\n headSet--------"+((TreeSet) t).headSet(30));
		System.out.println("\n tailSet--------"+((TreeSet) t).tailSet(11));

	}

}
