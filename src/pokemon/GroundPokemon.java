package pokemon;

import java.util.HashMap;
import java.util.Map;
import pokemon.Pokemon.PokemonTypes;

public class GroundPokemon extends Pokemon {
	
	private static final PokemonTypes type = PokemonTypes.GROUND;
	private static final Map<PokemonTypes, Integer> effectivenessMap = new HashMap<PokemonTypes, Integer>();
	
	public GroundPokemon(String pokemonName, int maximumHp, Attack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonTypes.NORMAL,	100);
			effectivenessMap.put(PokemonTypes.FIRE,		200);
			effectivenessMap.put(PokemonTypes.WATER,	100);
			effectivenessMap.put(PokemonTypes.ELECTRIC,	200);
			effectivenessMap.put(PokemonTypes.GRASS,	 50);
			effectivenessMap.put(PokemonTypes.ICE,		100);
			effectivenessMap.put(PokemonTypes.FIGHTING,	100);
			effectivenessMap.put(PokemonTypes.POISON, 	200);
			effectivenessMap.put(PokemonTypes.GROUND, 	100);
			effectivenessMap.put(PokemonTypes.FLYING,	  0);
			effectivenessMap.put(PokemonTypes.PSYCHIC,	100);
			effectivenessMap.put(PokemonTypes.BUG,		 50);
			effectivenessMap.put(PokemonTypes.ROCK,		200);
			effectivenessMap.put(PokemonTypes.GHOST,	100);
			effectivenessMap.put(PokemonTypes.DRAGON,	100);
		}
	}
	
}
