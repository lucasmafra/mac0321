package pokemon;

import java.util.HashMap;
import java.util.Map;

public class RockPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.ROCK;
	private static final Map<PokemonType, Integer> effectivenessMap = new HashMap<PokemonType, Integer>();

	public RockPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIRE, 		Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.WATER, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ELECTRIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GRASS, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ICE, 		Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.FIGHTING, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.POISON, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GROUND, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.FLYING, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.PSYCHIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.BUG, 		Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ROCK, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GHOST, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.DRAGON, 	Effectiveness.NORMAL.getValue());
		}
	}

}
