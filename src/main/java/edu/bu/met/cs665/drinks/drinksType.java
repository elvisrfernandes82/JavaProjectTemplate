package edu.bu.met.cs665.drinks;

import java.util.Scanner;

public class drinksType {
	
	Scanner keyboard = new Scanner(System.in);
	public String name = "New Hot drink";
	
	public int addMilk() {// this is the method that adds milk
		
		System.out.println("\n Do you want an Extra Milk ? If Yes press number one, or zero if not.");
		while (true) {
			int milkUnit = keyboard.nextInt();//Scanner object reads in a string of digits and converts them into an int type.

			if (milkUnit == 1) { // check the user input 

				System.out.println("How many Unit of Milk Do you want on your hot drink?");
				while (true) {
					System.out.println("Be aware the maximum  milk units that you can choose is three");
					int milkUnits = keyboard.nextInt();
					if (milkUnits >= 1 && milkUnits <= 3) {
						System.out.println(" " + milkUnits + " Milk Unit is added to your Drink");
						return milkUnits;
					} 
					else {
						System.out.println("This number is invalid, please insert a new number");
						continue;
					}
				}

			}
			else if (milkUnit == 0) {
				return 0;
			}
			else {
				System.out.println("This number is invalid, please insert a new number");
				continue;
			}
		}
	}
	public int addSugar() {// this is the method that adds milk
		
		System.out.println("\n Do you want an Extra Sugar ? If Yes press number one, or zero if not. ");

		while (true) {

			int sugarUnit = keyboard.nextInt();

			if (sugarUnit == 1) {// check the user input 
				System.out.println("How many Unit of Sugar Do you want on your hot drink?");
				while (true) {
					System.out.println("Be aware the maximum Sugar Units is three");
					int sugarUnits = keyboard.nextInt();
					if (sugarUnits >=1 && sugarUnits <= 3) {
						System.out.println(" " + sugarUnits + " sugar unit is added to your Drink");
						return sugarUnits;
					} 
					else {
						System.out.println("This number is invalid, please insert a new number");
						continue;
					}
				}

			} 
			else if (sugarUnit == 0) {
				return 0;
			}
			else {
				System.out.println("This number is invalid, please insert a new number");
				continue;
			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
