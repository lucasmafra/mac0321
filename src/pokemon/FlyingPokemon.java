package pokemon;

import java.util.HashMap;
import java.util.Map;

public class FlyingPokemon extends Pokemon {
	
	private static final PokemonType type = PokemonType.FLYING;
	private static final Map<PokemonType, Integer> effectivenessMap = new HashMap<PokemonType, Integer>();
	
	public FlyingPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL,	100);
			effectivenessMap.put(PokemonType.FIRE,		100);
			effectivenessMap.put(PokemonType.WATER,	100);
			effectivenessMap.put(PokemonType.ELECTRIC,	 50);
			effectivenessMap.put(PokemonType.GRASS,	200);
			effectivenessMap.put(PokemonType.ICE,		100);
			effectivenessMap.put(PokemonType.FIGHTING,	200);
			effectivenessMap.put(PokemonType.POISON, 	100);
			effectivenessMap.put(PokemonType.GROUND, 	100);
			effectivenessMap.put(PokemonType.FLYING,	100);
			effectivenessMap.put(PokemonType.PSYCHIC,	100);
			effectivenessMap.put(PokemonType.BUG,		200);
			effectivenessMap.put(PokemonType.ROCK,		 50);
			effectivenessMap.put(PokemonType.GHOST,	100);
			effectivenessMap.put(PokemonType.DRAGON,	100);
		}
	}
	
}
