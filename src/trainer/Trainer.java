package trainer;

import java.util.ArrayList;

import pokemon.Pokemon;

public class Trainer {
	
	public static final int MAX_POKEMONS = 6;
	private String name;
	private Pokemon pokemons[] = new Pokemon[MAX_POKEMONS];
	private int numberOfPokemons = 0;
	private ArrayList<Item> items;
	
	public Trainer(String trainerName, Pokemon pokemons[], ArrayList<Item> items) {
		this.name = trainerName;
		this.pokemons = pokemons;
		this.items = items;
	}
	
	public boolean addPokemon(Pokemon pokemon) {
		if (numberOfPokemons < MAX_POKEMONS) {
			pokemons[numberOfPokemons++] = pokemon;
			return true;
		}
		else
			return false;			
	}
	public int getNumberOfPokemons() {
		return numberOfPokemons;
	}
	public String getName() {
		return name;
	}
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
}
