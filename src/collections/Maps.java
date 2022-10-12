package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		HashMap <Integer,String> h=new HashMap<Integer,String>();
		h.put(110, "Bunny");
		h.put(120, "Rasheed");
		h.put(123, "Narendra");
		h.put(122, "Praveen");
		h.put(106, "Harsha");
		h.put(110, "Ashok");
		System.out.println(h);
		System.out.println("---------------------------------------------------------------");
		h.forEach((key,value)->System.out.println(key+" "+value+"\n"));
		
		
		LinkedHashMap <Integer,String> l=new LinkedHashMap<Integer,String>();
		l.put(110, "Bunny");
		l.put(120, "Rasheed");
		l.put(123, "Narendra");
		l.put(122, "Praveen");
		l.put(106, "Harsha");
		l.put(110, "Ashok");
		System.out.println(l);
		System.out.println("---------------------------------------------------------------");
		l.forEach((key,value)->System.out.println(key+" "+value+"\n"));
		

	TreeMap <Integer,String> t=new TreeMap<Integer,String>();
		t.put(110, "Bunny");
		t.put(120, "Rasheed");
		t.put(123, "Narendra");
		t.put(122, "Praveen");
		t.put(106, "Harsha");
		t.put(110, "Ashok");
		System.out.println(t);
		System.out.println("---------------------------------------------------------------");
		t.forEach((key,value)->System.out.println(key+" "+value));
}
}