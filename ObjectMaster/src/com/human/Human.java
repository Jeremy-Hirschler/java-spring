package com.human;

public class Human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	public String name;
	
	public Human(int strength, int stealth, int intelligence, int health, String name) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
		this.name = name;
	}
	
	public Human(int strength, int stealth, int intelligence, int health) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}
	public Human(String name) {
		this.name = name;
	}
	
	
	public void attack(Human defender) {
		defender.health -= this.strength;
		System.out.println(String.format("%s attacks %s!", this.name, defender.name));
		System.out.println(String.format("%s's health: %d. (%s's strength: %d)", defender.name, defender.health, this.name, this.strength ));
	}
	
	public String toString() {
		return getClass().getSimpleName();
	}
}
