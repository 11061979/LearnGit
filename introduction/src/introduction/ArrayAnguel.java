package introduction;

public class ArrayAnguel {

	public static void main(String[] args) {
		// ArrayAnguel ar = new ArrayAnguel();
		// int a[] = { 5, 6, 7, 7, 8, 8 };
		// int a [] = new int [3];
		// a[0]=1;
		// a[1]=2;

		// a[2]=3;

		// for (int i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
		/*
		 * int d[][] = { { 2, 4, 5 }, { 6, 7, 8 }, { 9, 10, 11 } };
		 * 
		 * int b[][] = new int[2][3]; b[0][0] = 2; b[0][1] = 4; b[0][2] = 5; b[1][0] =
		 * 6; b[1][1] = 7; b[1][2] = 8;
		 */

		//int b[][] = { { 2, 4, 5 }, { 6, 7, 8 } };
		int b[][] = new int[2][3];
		b[0][0] = 2;
		b[0][1] = 4;
		b[0][2] = 5;
		b[1][0] = 6;
		b[1][1] = 7;
		b[1][2] = 8;
		for (int c = 0; c < 2; c++)

		{
			for (int j = 0; j < 3; j++)

			{

				System.out.println(b[c][j]);
			}
			System.out.println();

		}

		// System.out.println(b[c]);
	}

}
