package introduction;

public class Striing {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		String s = "Anguel Nikolov Hristov";
		String[] split = s.split("Nikolov");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[1].trim());
		for (int i = s.length() - 1; i >=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
