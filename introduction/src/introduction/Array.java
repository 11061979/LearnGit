package introduction;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 4;
		System.out.println(arr[0]);

		int[] arr1 = { 2, 3, 4 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);

		}

		int[] arr2 = { 2, 3, 4, 7, 9 };
		for (int a : arr2) {
			System.out.println(a);
			

		}
		String[] str = { "anguel", "huio" };
		for (String j : str) {
			System.out.println(j);
			System.out.println(str[0]);

		}
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anguel");
		al.add("Nika");
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		for (String b : al) {
			System.out.println(b);

		}
	}
}
