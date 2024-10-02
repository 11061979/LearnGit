package introduction;

public class StringMethods {

	public static void main(String[] args) {
		String a = "javatraining";
		String b = " UPPERCASE";

		System.out.println(a.charAt(0));
		System.out.println(a.indexOf("j"));
		System.out.println(a.substring(1, 6));
		System.out.println(a.substring(4));
		System.out.println(a.concat(" anguel teaches"));
		System.out.println(a.length());
		System.out.println(b);
		System.out.println(b.trim());
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		String[] arr = (a.split("r"));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("a", "y"));
		System.out.println("*******");

		String t = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			t = t + a.charAt(i);
		}
		{

			System.out.println(t);

		}

	}
}
