package collections;

import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {

	TreeMap <Integer,String> t=new TreeMap<Integer,String>();
		t.put(110, "Bunny");
		t.put(120, "Rasheed");
		t.put(123, "Narendra");
		t.put(122, "Praveen");
		t.put(106, "Harsha");
		t.put(110, "Ashok");
		System.out.println(t);
		t.forEach((key,value)->System.out.println(key+" "+value));
}
}