package groceryshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {
	private static ArrayList myArr = new ArrayList();
	private static Scanner sc = new Scanner(System.in);

	public void addGroceryItem(Object item) {
		myArr.add(item);
	}

	public static void printGroceryList() {
		System.out.println("You have " + myArr.size() + "items in your cart");
		for (int i = 0; i < myArr.size(); i++) {
			System.out.println((i + 1) + " " + myArr.get(i));
		}
	}

	public void modifyItem() {
		printGroceryList();
		System.out.println("Enter for Postion to modify");
		int pos = sc.nextInt();
		System.out.println("Enter the item");
		String newItem = sc.next();
		myArr.set(pos, newItem);
		System.out.println("Grocery item" + (pos + 1) + "modified");
	}

	public void removeItem() {
		printGroceryList();
		System.out.println("Enter name of the item to remove");
		myArr.remove(sc.next());
	}

	public void findItem() {
		printGroceryList();
		System.out.println(" Enter the  value to find an item");
		int a = sc.nextInt();
		System.out.println(myArr.get(a));
	}

}