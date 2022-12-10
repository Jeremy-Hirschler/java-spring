package com.test;
import com.operate.*;

public class CalculatorTest {

	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		calc.setOperandOne(10.5);
//		calc.setOperation("-");
//		calc.setOperandTwo(5.1);
//		calc.performOperation();
//		System.out.println(calc.getResults());
		
		CalculatorTwo calcy = new CalculatorTwo();
		calcy.performOperation(10.5);
		calcy.performOperation('+');
		calcy.performOperation(5.2);
		calcy.performOperation('*');
		calcy.performOperation(10);
		calcy.performOperation('+');
		calcy.performOperation(5);
		calcy.performOperation('*');
		calcy.performOperation(2);
		calcy.getResults();

	}

}
