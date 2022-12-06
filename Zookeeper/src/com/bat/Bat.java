package com.bat;
import com.mammal.*;

public class Bat extends Mammal{
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	public void fly() {
		System.out.println("pssh...");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Souls devoured");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("MyWatermelon!");
		energyLevel -= 100;
	}
}
