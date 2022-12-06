package com.test;
import com.bat.*;

public class BatTest {

	public static void main(String[] args) {
		Bat buffy = new Bat(300);
		buffy.displayEnergy();
		buffy.attackTown();
		buffy.attackTown();
		buffy.attackTown();
		buffy.displayEnergy();
		
		buffy.eatHumans();
		buffy.eatHumans();
		buffy.displayEnergy();
		
		buffy.fly();
		buffy.displayEnergy();

	}

}
