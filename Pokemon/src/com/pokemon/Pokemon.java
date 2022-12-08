package com.pokemon;

public class Pokemon {
	public String name;
	public int health;
	public String type;
	public static int createdPokemon = 0;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		createdPokemon ++;
	}
	
	public void attackPokemon(Pokemon defender) {
		defender.health -= 10;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int healthPoints) {
		this.health = healthPoints;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
