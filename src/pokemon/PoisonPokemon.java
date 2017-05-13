package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class PoisonPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.POISON;
	private static final Map<PokemonType, Integer> effectivenessMap = new EnumMap<PokemonType, Integer>(PokemonType.class);

	public PoisonPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIRE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.WATER, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ELECTRIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GRASS, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ICE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIGHTING, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.POISON, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GROUND, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.FLYING, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.PSYCHIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.BUG, 		Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ROCK, 		Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GHOST, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.DRAGON, 	Effectiveness.NORMAL.getValue());
		}
	}

}
