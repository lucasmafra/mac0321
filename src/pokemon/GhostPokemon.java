package pokemon;

import java.util.HashMap;
import java.util.Map;

public class GhostPokemon extends Pokemon {
	
	private static final PokemonTypes type = PokemonTypes.GHOST;
	private static final Map<PokemonTypes, Integer> effectivenessMap = new HashMap<PokemonTypes, Integer>();
	
	public GhostPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonTypes.NORMAL,	  0);
			effectivenessMap.put(PokemonTypes.FIRE,		100);
			effectivenessMap.put(PokemonTypes.WATER,	100);
			effectivenessMap.put(PokemonTypes.ELECTRIC,	100);
			effectivenessMap.put(PokemonTypes.GRASS,	100);
			effectivenessMap.put(PokemonTypes.ICE,		100);
			effectivenessMap.put(PokemonTypes.FIGHTING,	100);
			effectivenessMap.put(PokemonTypes.POISON, 	100);
			effectivenessMap.put(PokemonTypes.GROUND, 	100);
			effectivenessMap.put(PokemonTypes.FLYING,	100);
			effectivenessMap.put(PokemonTypes.PSYCHIC,	  0);
			effectivenessMap.put(PokemonTypes.BUG,		100);
			effectivenessMap.put(PokemonTypes.ROCK,		100);
			effectivenessMap.put(PokemonTypes.GHOST,	200);
			effectivenessMap.put(PokemonTypes.DRAGON,	100);
		}
	}
	
}
