package pokemon;

import java.util.HashMap;
import java.util.Map;

public class BugPokemon extends Pokemon {
	
	private static final PokemonTypes type = PokemonTypes.BUG;
	private static final Map<PokemonTypes, Integer> effectivenessMap = new HashMap<PokemonTypes, Integer>();
	
	public BugPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonTypes.NORMAL,	100);
			effectivenessMap.put(PokemonTypes.FIRE,		 50);
			effectivenessMap.put(PokemonTypes.WATER,	100);
			effectivenessMap.put(PokemonTypes.ELECTRIC,	100);
			effectivenessMap.put(PokemonTypes.GRASS,	200);
			effectivenessMap.put(PokemonTypes.ICE,		100);
			effectivenessMap.put(PokemonTypes.FIGHTING,	 50);
			effectivenessMap.put(PokemonTypes.POISON, 	200);
			effectivenessMap.put(PokemonTypes.GROUND, 	100);
			effectivenessMap.put(PokemonTypes.FLYING,	 50);
			effectivenessMap.put(PokemonTypes.PSYCHIC,	200);
			effectivenessMap.put(PokemonTypes.BUG,		100);
			effectivenessMap.put(PokemonTypes.ROCK,		100);
			effectivenessMap.put(PokemonTypes.GHOST,	100);
			effectivenessMap.put(PokemonTypes.DRAGON,	100);
		}
	}
	
}
