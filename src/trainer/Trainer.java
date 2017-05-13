package trainer;

import java.util.ArrayList;

import pokemon.Pokemon;

public class Trainer {
	
	public static final int MAX_POKEMONS = 6;
	private String name;
	private Pokemon pokemons[] = new Pokemon[MAX_POKEMONS];
	private int numberOfPokemons = 0;
	private int currentPokemon;
	private ArrayList<Item> items;
	
	public Trainer(String trainerName, Pokemon pokemons[], ArrayList<Item> items) {
		// TODO Treat trainerName == null
		this.name = trainerName;
		this.pokemons = pokemons;
		this.items = items;
	}
	
	public boolean addPokemon(Pokemon pokemon) {
		if (numberOfPokemons < MAX_POKEMONS) {
			pokemons[numberOfPokemons++] = pokemon;
			setCurrentPokemon(numberOfPokemons - 1); //sempre que adiciona um pokemon, coloca ele como o atual
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

	public int getCurrentPokemon() {
		return currentPokemon;
	}

	public void setCurrentPokemon(int currentPokemon) {
		this.currentPokemon = currentPokemon;
	}
	
	public void damagePokemon(int damage) {
		pokemons[currentPokemon].damage(damage);		
	}
	
	public void healPokemon(Pokemon pokemon, int hp) {
		pokemon.heal(hp);
	}
	
	public int indexOf(Pokemon pokemon) {
		for (int i = 0; i< this.numberOfPokemons;i++) {
			if (pokemon == this.pokemons[i])
				return i;
		}
		return -1;
	}
}
