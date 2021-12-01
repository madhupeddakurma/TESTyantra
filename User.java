package groceryshop;

import java.util.Scanner;

public class User {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Grocery p = new Grocery();
		boolean val = true;

		while (val) {
			System.out.println("Welcome to Grocery..");
			System.out.println("Press 1 for add items to Cart");
			System.out.println("Press 2 for Remove items in cart");
			System.out.println("Press 3 for View all the Grocaries");
			System.out.println("Press 4 for Get a specific item");
			System.out.println("Press 4 for Replace an item");
			System.out.println("Press 4 for Exit from cart");
			System.out.println("Enter your choice Below");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				p.addGroceryItem(sc.next());
				break;
			}
			case 2: {
				p.removeItem();
				break;
			}
			case 3: {
				Grocery.printGroceryList();
				break;
			}
			case 4: {
				p.findItem();
				break;
			}
			case 5: {
				System.out.println();
				p.modifyItem();
				break;
			}
			case 6: {
				Grocery.printGroceryList();
				System.out.println("Thank You for Shopping with us..");
				val = false;
			}
			}
		}
	}
}