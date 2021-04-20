package org.tekcamp.springtek.beans.calc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

	@Autowired
	Calculator calc;

	@ParameterizedTest
	@CsvSource({"1,1,2","2,2,4","20,0,20","0,0,0","-100,-1000,-1100"})
	void add(int x, int y, int s) {
		int expected = s;
		int actual = calc.add(x,y);
		assertEquals(expected,actual);
	}

	@ParameterizedTest
	@CsvSource({"1,1,0","4,2,2","20,0,20","0,0,0","-100,-1000,900"})
	void subtract(int x, int y, int s) {
		int expected = s;
		int actual = calc.subtract(x,y);
		assertEquals(expected,actual);
	}

	@ParameterizedTest
	@CsvSource({"1,1,1","4,2,2","0,20,0","12,2,6","-100,100,-1"})
	void divide(int x, int y, int s) {
		int expected = s;
		int actual = calc.divide(x,y);
		assertEquals(expected,actual);
	}

	@ParameterizedTest
	@CsvSource({"1,2,2","4,2,8","20,0,0","0,0,0","-100,-1000,100000"})
	void multiply(int x, int y, int s) {
		int expected = s;
		int actual = calc.multiply(x,y);
		assertEquals(expected,actual);
	}

}