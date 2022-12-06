package com.mammal;

public class Mammal {
	protected int energyLevel;
	
	public void displayEnergy() {
		System.out.println(String.format("Energy Level: %d", energyLevel));
	}
	
	public Mammal(int energyLevel){
		this.energyLevel = energyLevel;
	}
}
