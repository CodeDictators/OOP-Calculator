package com.blz.calculator.utils;

import java.util.Scanner;

public class UserInputUtility {
	private static final Scanner SC = new Scanner(System.in);

	private UserInputUtility() {
	}

	public static int intVal() {
		return SC.nextInt();
	}
}
