package week2;

public class Loops {

	public static void main(String[] args) {
		
		// Print even numbers from 0 to 100 using a while loop
		System.out.println("---Problem 1---");
		int counter = 0;
		while (counter <= 100) {
			if (counter % 2 == 0 && counter != 0) {
				System.out.println(counter);
			}
			counter++;		
		}

		// print every 3rd number going backwards from 100 until 0 using while
		System.out.println("---Problem 2---");
		counter = 100;
		while (counter >= 4) {
			counter = counter - 3;
			System.out.println(counter);
		}
		
		// a for loop that prints every other number from 1 to 100
		System.out.println("---Problem 3---");
		counter = 1;
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
		
		// fizzbuzz
		System.out.println("---Problem 4---");
		for (int i=1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("HelloWorld");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else if (i % 3 == 0) {
				System.out.println("Hello");
			} else {
				System.out.println(i);
			}
		}

	}

}
