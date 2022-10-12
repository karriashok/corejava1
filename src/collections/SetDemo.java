package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		System.out.println("HashSet : ");
		Set<String>hs=new HashSet<String>();
		hs.add("40");
		hs.add("15");
		hs.add("20");
		hs.add("25");
		hs.add("30");
		hs.add(" ");
		hs.add("40");
		hs.add("45");
		hs.add("50");
		hs.add("60");
		hs.add("70");
		System.out.println(hs);
		
		System.out.println("\nLinkedSet : ");
		Set<String>lhs=new LinkedHashSet<String>();
		lhs.add("A");
		lhs.add("R");
		lhs.add("B");
		lhs.add("A");
		lhs.add("H");
		lhs.add(" ");
		lhs.add("K");
		lhs.add("L");
		lhs.add("O");
		lhs.add("U");
		lhs.add("P");
		System.out.println(lhs);
		
		System.out.println("\nTreeset : ");
		Set<String>t=new TreeSet<String>();
		t.add("B");
		t.add("D");
		t.add("U");
		t.add("A");
		t.add("E");
		t.add("F");
		t.add("C");
		t.add("C");
		t.add("G");
		t.add("H");
		t.add("I");
		System.out.println(t);
	}

}
