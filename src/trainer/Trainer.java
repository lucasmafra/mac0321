package trainer;

import java.util.ArrayList;

import pokemon.Pokemon;

public class Trainer {
	
	public static final int MAX_POKEMONS = 6;
	private String name;
	private Pokemon pokemons[] = new Pokemon[MAX_POKEMONS];
	private ArrayList<Item> items;
	
	public Trainer(String trainerName, Pokemon pokemons[], ArrayList<Item> items) {
		this.name = trainerName;
		this.pokemons = pokemons;
		this.items = items;
	}
}
