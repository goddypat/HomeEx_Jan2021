package numbers;

import java.util.Random;

public class HwExam {

	public static void main(String[] args) {

		
		Random user = new Random();
		int counter;
		int[] numbers = new int[500];
		numbers[0] = user.nextInt(700);
		// Set it as largest
		int largest = numbers[0];
		// Set it as smallest
		int smallest = numbers[0];
		for (counter = 1; counter < 500; counter++) {
			numbers[counter] = user.nextInt(700);
			largest = Math.max(largest, numbers[counter]);
			smallest = Math.min(smallest, numbers[counter]);

		}

	}

}
