package com.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, int health, String type);
	String pokemonInfo(Pokemon pokemon);
	static void listPokemon() {
		//implement list
	}
	
}
