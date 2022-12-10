package com.operate;
import java.util.ArrayList;

public class CalculatorTwo implements java.io.Serializable {
	
	private ArrayList<Object> arr = new ArrayList<Object>();
	private char operand;
	private double num;
	private Object x;
	private Object y;
	private Object result;
	
	
	public CalculatorTwo() {
		
	}
	
	public void performOperation(char operand) {
		this.operand = operand;
		arr.add(operand);
	}
	
	public void performOperation(double num) {
		this.num = num;
		arr.add(num);
	}
	
	public void getResults() {
		while (arr.size() > 1) {
			
		
			if (arr.contains('*')){
				
				double x = (double) arr.get(arr.indexOf('*') - 1);
				double y =(double) arr.get(arr.indexOf('*') + 1);
				result = x * y;
				System.out.println(result);
				arr.set(arr.indexOf('*') - 1, result);
				arr.remove(arr.indexOf('*') + 1);
				arr.remove(arr.indexOf('*'));
				
			}
		
			if (arr.contains('+')) {
				double x = (double) arr.get(arr.indexOf('+') - 1);
				double y =(double) arr.get(arr.indexOf('+') + 1);
				result = x + y;
				System.out.println(result);
				arr.set(arr.indexOf('+') - 1, result);
				arr.remove(arr.indexOf('+') + 1);
				arr.remove(arr.indexOf('+'));
			}
			System.out.println(arr);
		}
	}
}
