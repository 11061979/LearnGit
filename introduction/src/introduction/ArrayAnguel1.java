package introduction;

public class ArrayAnguel1 {

	public static void main(String[] args) {

		/*
		 * int a[] = { 5, 6, 7, 3 }; int min = a[0]; for (int i = 0; i < a.length; i++)
		 * { if (a[i] < min) { min = a[i]; }
		 * 
		 * } System.out.println(" Min number is " + min);
		 * 
		 * System.out.println("********");
		 */

		int b[][] = { { 1, 11, 13}, { 4, 6, 7 }, { 9, 8, 11 } };
		int minnr = b[0][0];
		int minColumn = 0;
		for (int i = 0; i < b.length; i++)

		{
			for (int j = 0; j < b.length; j++) {
				if (b[i][j] < minnr) {
					minnr = b[i][j];
					minColumn = j;
				}
			}

		}
		int max = b[0][minColumn];
		int k = 0;
		while (k < 3) {
			if (b[k][minColumn] > max) {
				max = b[k][minColumn];
			}
			k++;

		}

		System.out.println(" Min number is " + minnr);
		System.out.println(" Max number is " + max);

	}

}
