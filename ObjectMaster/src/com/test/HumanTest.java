package com.test;
import com.human.*;

public class HumanTest {

	public static void main(String[] args) {
		Human kyle = new Human("Kyle");
		Human jen = new Human("Jen");
		jen.attack(kyle);
		jen.attack(kyle);
		kyle.attack(jen);

	}
	

}
