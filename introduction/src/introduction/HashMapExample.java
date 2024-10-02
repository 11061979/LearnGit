package introduction;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {


		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "anguel");
		hm.put(1, "nika");
		hm.put(2, "dana");
		for (int i = 0; i < hm.size(); i++) {
            System.out.println(hm.get(i));



		
	}
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		


}
}
