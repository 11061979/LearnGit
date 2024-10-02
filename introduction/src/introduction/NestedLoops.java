package introduction;

public class NestedLoops {

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i < 3; i++) { System.out.println("Outer loop Started");
		 * 
		 * for (int j = 1; j < 5; j++) { System.out.println("Inner loop started");
		 * 
		 * } System.out.println("Inner loop Finished");
		 * 
		 * System.out.println("Outer loop Finished");
		 * 
		 * }
		 */
		/*
		 * int k = 1; for (int i = 0; i <= 4; i++) { for (int j = 1; j <= 4 - i; j++) {
		 * System.out.print(k); System.out.print("\t"); k++; } System.out.println("");
		 * 
		 * for (int j = 2; j <= 7; j++) {
		 * 
		 * System.out.print(j);
		 * 
		 * 
		 * 
		 * for(int c = 3; c <= 9; c++) { System.out.print(c);
		 * 
		 * 
		 * 
		 * for (int d = 4; d <= 4; d++) { System.out.println(d);
		 * 
		 * }
		 * 
		 * }
		 */
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
			/*
			 * for (int j = 2; j <= 7; j++) {
			 * 
			 * System.out.print(j);
			 * 
			 * 
			 * 
			 * for(int c = 3; c <= 9; c++) { System.out.print(c);
			 * 
			 * 
			 * 
			 * for (int d = 4; d <= 4; d++) { System.out.println(d);
			 * 
			 * }
			 */
		}

	}
}
