package com.gorilla;
import com.mammal.*;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel){
		super(energyLevel);
	}
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Gorilla has thrown a banana.");
		
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("Gorilla is satisfied");
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("Gorilla has climbed a tree.");
	}
}
