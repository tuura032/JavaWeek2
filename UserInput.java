package week2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Welcome " + name);
		

		
		
		double total = 0;
		boolean continueShopping = true;
		
		while (continueShopping == true) {
			
			// Give user options
			System.out.println("What would you like to purchase? ");
			System.out.println("1) add one dozen eggs for 1.99");
			System.out.println("2) add 6 large avocados for 6.95");
			System.out.println("3) add salmon for 12.99");
			System.out.println("4) check out!");
			System.out.println("        Your selection: ");
			int selection = sc.nextInt();
			
			switch (selection) {
				case 1:
					total += 1.99;
					System.out.println("Your total cost so far is " + total);
					break;
				case 2: 
					total += 6.95;
					System.out.println("Your total cost so far is " + total);
					break;
				case 3:
					total += 12.99;
					System.out.println("Your total cost so far is " + total);				
					break;
				case 4:
					continueShopping = false;
					break;
				default:
					System.out.println("Please pick a valid option.");
			}
		}
		
		System.out.println("Your total cost is: " + total + ". Thanks for shopping with us today!");
			
		
	}

}
