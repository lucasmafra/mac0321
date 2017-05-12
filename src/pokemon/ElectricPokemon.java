package pokemon;

import java.util.HashMap;
import java.util.Map;

public class ElectricPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.ELECTRIC;
	private static final Map<PokemonType, Integer> effectivenessMap = new HashMap<PokemonType, Integer>();

	public ElectricPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIRE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.WATER, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ELECTRIC, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GRASS, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ICE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIGHTING, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.POISON, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GROUND, 	Effectiveness.NO_EFFECT.getValue());
			effectivenessMap.put(PokemonType.FLYING, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.PSYCHIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.BUG, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ROCK, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GHOST, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.DRAGON, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
		}
	}

}
