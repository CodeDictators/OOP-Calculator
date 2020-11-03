package com.blz.calculator.utils;

import com.blz.calculator.constant.Constants;
import com.blz.calculator.model.Inputs;
import com.blz.calculator.service.CalculationService;
import com.blz.calculator.service.provider.Calculate;

public class Menu {

	private Menu() {
	}

	public static Menu getInstance() {
		return new Menu();
	}

	private static final CalculationService CALCI = new Calculate();

	private static final Inputs userInput = new Inputs();

	public void menuRun() {
		int choice;
		do {
			choice = Constants.menu();
			switch (choice) {
			case 1:
				userInput();
				System.out.println("Add: " + CALCI.add(userInput));
				break;
			case 2:
				userInput();
				System.out.println("Sub: " + CALCI.sub(userInput));
				break;
			case 3:
				userInput();
				System.out.println("Mul: " + CALCI.mul(userInput));
				break;
			case 4:
				userInput();
				System.out.println("Div: " + CALCI.div(userInput));
				break;
			case 5:
				System.out.println("Bye..!!!");
				break;
			default:
				System.out.println("Select proper option...");
			}
		} while (choice != 5);
	}

	private static void userInput() {
		System.out.println("Enter First Number: ");
		userInput.setNumberOne(UserInputUtility.intVal());
		System.out.println("Enter Second Number: ");
		userInput.setNumberTwo(UserInputUtility.intVal());
	}
}
