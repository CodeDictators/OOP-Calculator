package com.blz.calculator.constant;

import com.blz.calculator.utils.UserInputUtility;

public class Constants {
	private Constants() {
	}

	public static int menu() {
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit");
		System.out.println("Select any option: ");
		return UserInputUtility.intVal();
	}
}
