package pokemon;

import java.util.HashMap;
import java.util.Map;
import pokemon.Pokemon.PokemonTypes;

public class FightingPokemon extends Pokemon {
	
	private static final PokemonTypes type = PokemonTypes.NORMAL;
	private static final Map<PokemonTypes, Integer> effectivenessMap = new HashMap<PokemonTypes, Integer>();
	
	public FightingPokemon(String pokemonName, int maximumHp, Attack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonTypes.NORMAL,	200);
			effectivenessMap.put(PokemonTypes.FIRE,		100);
			effectivenessMap.put(PokemonTypes.WATER,	100);
			effectivenessMap.put(PokemonTypes.ELECTRIC,	100);
			effectivenessMap.put(PokemonTypes.GRASS,	100);
			effectivenessMap.put(PokemonTypes.ICE,		200);
			effectivenessMap.put(PokemonTypes.FIGHTING,	100);
			effectivenessMap.put(PokemonTypes.POISON, 	 50);
			effectivenessMap.put(PokemonTypes.GROUND, 	100);
			effectivenessMap.put(PokemonTypes.FLYING,	 50);
			effectivenessMap.put(PokemonTypes.PSYCHIC,	 50);
			effectivenessMap.put(PokemonTypes.BUG,		 50);
			effectivenessMap.put(PokemonTypes.ROCK,		200);
			effectivenessMap.put(PokemonTypes.GHOST,	  0);
			effectivenessMap.put(PokemonTypes.DRAGON,	100);
		}
	}
	
}
