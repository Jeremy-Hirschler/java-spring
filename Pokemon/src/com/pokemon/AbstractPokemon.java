package com.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public String name;
	public int health;
	public String type;
	
//	public Pokemon createPokemon(String name, int health, String type) {
//		this.name = name;
//		this.health = health;
//		this.type = type;
//		return Pokemon(name, health, type);
//	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return String.format("Pokemon: %s - Health: %d - Type: %s", pokemon.name, pokemon.health, pokemon.type);
	}
}
