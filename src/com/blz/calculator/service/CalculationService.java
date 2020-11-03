package com.blz.calculator.service;

import com.blz.calculator.model.Inputs;

public interface CalculationService {
	public int add(Inputs userInput);

	public int sub(Inputs userInput);

	public int mul(Inputs userInput);

	public int div(Inputs userInput);
}
