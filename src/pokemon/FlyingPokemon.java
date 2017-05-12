package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class FlyingPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.FLYING;
	private static final Map<PokemonType, Integer> effectivenessMap = new EnumMap<PokemonType, Integer>(PokemonType.class);

	public FlyingPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIRE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.WATER, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ELECTRIC,  Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GRASS, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ICE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIGHTING, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.POISON, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GROUND, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FLYING, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.PSYCHIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.BUG, 		Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ROCK, 		Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GHOST, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.DRAGON, 	Effectiveness.NORMAL.getValue());
		}
	}

}
