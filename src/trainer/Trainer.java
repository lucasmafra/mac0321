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
		} else
			return false;
	}

	// Deletes the selected Pokémon if possible and shifts the vacant space to
	// the end of the array.
	public boolean removePokemon(int pokemonIndex) {
		if (pokemonIndex < 0 || pokemonIndex > numberOfPokemons || pokemons[pokemonIndex] == null) {
			return false;
		} else {
			for (int i = pokemonIndex; i < numberOfPokemons - 1; i++) {
				pokemons[i] = pokemons[i + 1];
			}
			pokemons[numberOfPokemons - 1] = null;
			return true;
		}
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
