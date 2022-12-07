package com.samurai;
import com.human.*;

public class Samurai extends Human {
	public static int sams = 0;
	
	public Samurai(String name) {
		super(3, 3, 3, 200);
		this.name = name;
		sams ++;
	}
	
	public void deathBlow(Human a) {
		this.health = this.health / 2;
		System.out.println(String.format("%s deals fatal damage to %s. %s's health: %d ", this.name, a.name, this.name, this.health));
	}
	
	public void meditate() {
		this.health *= 2;
		System.out.println(String.format("%s heals from calm. Health: %d", this.name, this.health));
	}
	
	public static int howMany() {
		return Samurai.sams;
	}
}
