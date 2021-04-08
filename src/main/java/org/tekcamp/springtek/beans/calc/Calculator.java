package org.tekcamp.springtek.beans.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Calculator {
	private Add add = new Add();
	private Subtract subtract = new Subtract();
	private Multiply multiply = new Multiply();
	private Divide divide = new Divide();

	public int add(int x, int y) {
		return add.apply(x,y);
	}


}


