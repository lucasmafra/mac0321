package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class GroundPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.GROUND;
	private static final Map<PokemonType, Integer> effectivenessMap = new EnumMap<PokemonType, Integer>(PokemonType.class);

	public GroundPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIRE, 		Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.WATER, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ELECTRIC, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GRASS, 	Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ICE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIGHTING, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.POISON, 	Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GROUND, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FLYING, 	Effectiveness.NO_EFFECT.getValue());
			effectivenessMap.put(PokemonType.PSYCHIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.BUG, 		Effectiveness.NOT_VERY_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.ROCK, 		Effectiveness.SUPER_EFFECTIVE.getValue());
			effectivenessMap.put(PokemonType.GHOST, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.DRAGON, 	Effectiveness.NORMAL.getValue());
		}
	}

}
