package introduction;

public class IfElseWhileDo {

	public static void main(String[] args) {

		if (5 < 2 && 3 > 2) {

			System.out.println("True");

		} else {
			System.out.println("False");
		}

		for (int i = 0; i < 10; i++)
			System.out.println(i);

		for (int i = 5; i <= 10; i++)
			System.out.println(i);

		for (int i = 0; i <= 10; i = i + 2)
			System.out.println(i);
		System.out.println("*****");

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;

		}

		int i1 = 10;
		while (i1 > 0) {
			System.out.println(i1);
			i1--;

		}
		System.out.println("*****");

		int j = 3;
		do {
			System.out.println(j);

			j++;
		}while(j<=5); {
			System.out.println(j);
		}
	}
}
