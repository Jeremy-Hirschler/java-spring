package com.ninja;
import com.human.*;

public class Ninja extends Human{
	public Ninja(String name){
		super(3, 10, 3, 100);
		this.name = name;
	}
	
	public void steal(Human a) {
		a.health -= this.stealth;
		System.out.println(String.format("%s had its energy drained!", a.name));
		this.health += this.stealth;
		System.out.println(String.format("%s's health increased by %d points.", this.name, this.stealth));
		
	}
	
	public String runAway() {
		return String.format("%s ran away. Health -%d", this.name, 10);
	}
}
