package introduction;

public class ArraySort {

	public static void main(String[] args) {

		int a[] = { 10, 1, 5, 2, 7 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
		System.out.println(a[i]);
		}
	}

}
