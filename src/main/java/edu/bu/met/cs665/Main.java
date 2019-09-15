package edu.bu.met.cs665;
// Citation: StackExchange, https://codereview.stackexchange.com/questions/37376/vending-machine-implementation
import java.util.Scanner;

import edu.bu.met.cs665.drinks.drinksType;
import edu.bu.met.cs665.drinks.espress;
import edu.bu.met.cs665.drinks.Americano;
import edu.bu.met.cs665.drinks.LatteMacchiato;
import edu.bu.met.cs665.drinks.BlackTea;
import edu.bu.met.cs665.drinks.GreenTea;
import edu.bu.met.cs665.drinks.YellowTea;


public class Main {

  public static void main(String[] args) {
	  
	  while (true) {
			//“Fully Automatic Beverage Vending Machine Menu
		    System.out.println(" \n What Do you would Like to Drink. Cofe or Tea?\n\n");
			System.out.println(" For Coffee choose:");
			System.out.println(" 1 For Espresso, 2 For Americano, and 3 For Latte Macchiato.\n");
			System.out.println(" For Tea Choose ");
			System.out.println(" 4 For Black Tea, 5 For Green Tea, and 6 For Yellow Tea\n");
			
			Scanner userInput = new Scanner(System.in);
			while (true) {//Get the user input about with type of hot drink they want
				int type = userInput .nextInt();

				if (type == 1) {
					drinksType espresso = new espress();
					prepYourDrink(espresso);
					break;
				} 
				else if (type == 2) {
					drinksType americano = new Americano();
					prepYourDrink(americano);
					break;
	
				} 
				else if (type == 3) {
					drinksType latteMacchiato = new LatteMacchiato();
					prepYourDrink(latteMacchiato);
					break;
	
				} 
				else if (type == 4) {
					drinksType blackTea = new BlackTea();
					prepYourDrink(blackTea);
					break;
	
				} 
				else if (type == 5) {
					drinksType greenTea = new GreenTea();
					prepYourDrink(greenTea);
					break;
	
				} 
				else if (type == 6) {
					drinksType yellowTea = new YellowTea();
					prepYourDrink(yellowTea);
					break;
				}
	
				else {
					System.out.println("Number invalid , Please Try again");
					continue;
				}
			}	
	  } 
  }
  private static void prepYourDrink(drinksType drinkName) {//prepYourDrink () is the process of creating a new hot drink
		
	  	Scanner userInput = new Scanner(System.in);
		int milkUnit = drinkName.addMilk();// User have the option to choose if he want milk on his drink or not
		int sugarUnit = drinkName.addSugar();// User have the option to choose if he want sugar on his drink or not
		String drinkNames = drinkName.getName();// varaible that save the name of the drink choose.
		System.out.println("Your  " + drinkNames + " is good to go. Enjoy \n");// let the user know that his or her drink is read.

	}
}
