package com.operate;

public class Calculator implements java.io.Serializable{
	private double x;
	private double y;
	private String operator;
	private double result;
	
	public Calculator() {
		
	}
	
	public void setOperandOne(double x) {
		this.x = x;
	}
	
	public void setOperation(String operator) {
		this.operator = operator;
	}
	
	public void setOperandTwo(double y) {
		this.y = y;
	}
	
	public void performOperation() {
		if (operator == "+") {
			result = x + y;
		}else {
			result = x - y;
		}
	}
	
	public double getResults() {
		return result;
	}
}
