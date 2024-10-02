package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ArayList {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("anguel");
		a.add("anguel");
		a.add("anguel");
		a.add(0, "nika");
		a.add(1, "dana");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a.indexOf("anguel"));
		System.out.println(a.getClass());
		System.out.println(a.contains("anguel"));
		System.out.println(a.size());
		System.out.println("&&&&&&&&&&");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("NI", "KA", "AZ", "TI"));
		al.add("Novo popylnenie");
		System.out.println(al);

		HashSet<String> hs = new HashSet<String>();
		hs.add("bed");
		hs.add("table");
		hs.add("chair");

		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		// System.out.println(i.next());
		// System.out.println(i.next());
		// System.out.println(i.next());
		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}
}
