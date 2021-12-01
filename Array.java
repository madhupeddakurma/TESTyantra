package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Array {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(2);
		ar.add("madhu");
		ar.add(1);
		ar.add(20.0);
		System.out.println(ar);
		HashSet hs = new HashSet();
		hs.add('t');
		hs.add(1);
		hs.add(1);
		hs.add(0);
		hs.add(30.0);
		System.out.println(hs);
		HashMap hp = new HashMap();
		hp.put(1, "madhu");
		hp.put(2, "mallaiah");
		hp.put(3, "neelamma");
		hp.put(4, "riya");
		hp.put(5, "abhi");
		hp.put(6, "vickey");
		System.out.println(hp);
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("s");
		t.add("a");
		t.add("madhu");
		t.add("vickey");
		t.add("Z");
		t.add("o");
		System.out.println(t);

	}

}
