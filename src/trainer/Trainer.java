package trainer;

import java.util.ArrayList;

import pokemon.Pokemon;

public class Trainer {

	public static final int MAX_POKEMONS = 6;
	private String name;
	private Pokemon pokemons[] = new Pokemon[MAX_POKEMONS];
	private int numberOfPokemons = 0;
	private int currentPokemonIndex;
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
			// sempre que um pokemon é adicionado, ele é colocado como atual.
			// currentPokemonIndex = numberOfPokemons;
			setCurrentPokemon(numberOfPokemons);
			return true;
		} else
			return false;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfPokemons() {
		return numberOfPokemons;
	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public int getCurrentPokemonIndex() {
		return currentPokemonIndex;
	}

	public void setCurrentPokemon(int pokemonIndex) {
		if (pokemonIndex != -1)
			currentPokemonIndex = pokemonIndex;
		else
			System.err.println("Error! pokemon doesn't belong to trainer " + getName());

	}
	
	public Pokemon getCurrentPokemon() {
		return pokemons[currentPokemonIndex];
	}

	public void damagePokemon(int damage) {
		pokemons[currentPokemonIndex].damage(damage);
	}

	public void healPokemon(int pokemonIndex, int hp) {
		if (pokemonIndex != -1)
			pokemons[pokemonIndex].heal(hp);
		else
			System.err.println("Error! pokemon doesn't belong to trainer " + getName());
	}

	public int indexOf(Pokemon pokemon) {
		for (int i = 0; i < this.numberOfPokemons; i++) {
			if (pokemon == this.pokemons[i])
				return i;
		}
		return -1;
	}
}
