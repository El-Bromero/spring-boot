package org.tekcamp.springtek.beans.calc;
import java.util.function.BiFunction;

public class Add implements BiFunction<Integer,Integer,Integer> {
	@Override
	public Integer apply(Integer x, Integer y) {
		return x + y;
	}
}
