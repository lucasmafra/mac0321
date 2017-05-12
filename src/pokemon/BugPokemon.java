package pokemon;

import java.util.HashMap;
import java.util.Map;

public class BugPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.BUG;
	private static final Map<PokemonType, Integer> effectivenessMap = new HashMap<PokemonType, Integer>();

	public BugPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIRE, 		Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.WATER, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ELECTRIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GRASS, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ICE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIGHTING, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.POISON, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GROUND, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FLYING, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.PSYCHIC, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.BUG, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ROCK, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GHOST, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.DRAGON, 	Effectiveness.NORMAL.getValue());
		}
	}

}
