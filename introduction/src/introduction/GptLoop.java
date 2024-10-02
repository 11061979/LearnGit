package introduction;

public class GptLoop {
	public static void main(String[] args) {
		int number = 1;

		// Array to define the number of elements in each row
		int[] rowElements = { 1, 2, 3, 4, 3, 2, 1 };

		// Loop through the rows
		for (int row = 0; row < rowElements.length; row++) {
			// Loop through the elements in the current row
			for (int col = 0; col < rowElements[row]; col++) {
				System.out.print(number + " ");
				number++;
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}