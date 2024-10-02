package introduction;

public class SwapIntegers {

	public static void main(String[] args) {

		int a = 5;
		int b = 1;
		/*
		 * int temp; temp = a; a = b; b = temp; System.out.println(a);
		 * System.out.println(b);
		 */

		a = a + b; // a=6
		b = a - b; // b=5
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

}
