package com.templates.cucumberTemplate;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestCase {
	CalculatorApp calculator= new CalculatorApp();
	
	public void addTwoPositiveNumbers()
	{
		int result= calculator.AddTwoNumbers(2, 7);
		Assert.assertEquals(9, result);
	}
	
	public void addTwoNegativeNumbers()
	{
		int result= calculator.AddTwoNumbers(-2, -7);
		Assert.assertEquals(-9, result);
	}
}
