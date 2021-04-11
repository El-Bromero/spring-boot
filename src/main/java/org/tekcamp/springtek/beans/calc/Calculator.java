package org.tekcamp.springtek.beans.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Calculator {
	@Autowired
	private Add add = new Add();

	@Autowired
	private Subtract subtract = new Subtract();

	@Autowired
	private Multiply multiply = new Multiply();

	@Autowired
	private Divide divide = new Divide();


	public int add(int x, int y) {
		return add.apply(x,y);
	}

	public int subtract(int x, int y) {
		return subtract.apply(x,y);
	}

	public int divide(int x, int y) {
		return divide.apply(x,y);
	}

	public int multiply(int x, int y) {
		return multiply.apply(x,y);
	}
}


