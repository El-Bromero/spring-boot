package org.tekcamp.springtek.beans.calc;
import org.springframework.stereotype.Component;

import java.util.function.BiFunction;

@Component
public class Add implements BiFunction<Integer,Integer,Integer> {
	@Override
	public Integer apply(Integer x, Integer y) {
		return x + y;
	}
}
