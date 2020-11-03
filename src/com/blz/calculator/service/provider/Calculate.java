package com.blz.calculator.service.provider;

import com.blz.calculator.model.Inputs;
import com.blz.calculator.service.CalculationService;

public class Calculate implements CalculationService {

	@Override
	public int add(Inputs userInput) {
		return userInput.getNumberOne() + userInput.getNumberTwo();
	}

	@Override
	public int sub(Inputs userInput) {
		return userInput.getNumberOne() - userInput.getNumberTwo();
	}

	@Override
	public int mul(Inputs userInput) {
		return userInput.getNumberOne() * userInput.getNumberTwo();
	}

	@Override
	public int div(Inputs userInput) {
		return userInput.getNumberOne() / userInput.getNumberTwo();
	}

}
