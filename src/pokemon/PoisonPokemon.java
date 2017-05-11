package pokemon;

import java.util.HashMap;
import java.util.Map;

public class PoisonPokemon extends Pokemon {
	
	private static final PokemonType type = PokemonType.POISON;
	private static final Map<PokemonType, Integer> effectivenessMap = new HashMap<PokemonType, Integer>();
	
	public PoisonPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL,	100);
			effectivenessMap.put(PokemonType.FIRE,		100);
			effectivenessMap.put(PokemonType.WATER,	100);
			effectivenessMap.put(PokemonType.ELECTRIC,	100);
			effectivenessMap.put(PokemonType.GRASS,	200);
			effectivenessMap.put(PokemonType.ICE,		100);
			effectivenessMap.put(PokemonType.FIGHTING,	100);
			effectivenessMap.put(PokemonType.POISON, 	 50);
			effectivenessMap.put(PokemonType.GROUND, 	 50);
			effectivenessMap.put(PokemonType.FLYING,	100);
			effectivenessMap.put(PokemonType.PSYCHIC,	100);
			effectivenessMap.put(PokemonType.BUG,		200);
			effectivenessMap.put(PokemonType.ROCK,		 50);
			effectivenessMap.put(PokemonType.GHOST,	 50);
			effectivenessMap.put(PokemonType.DRAGON,	100);
		}
	}
	
}
