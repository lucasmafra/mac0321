package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class RockPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.ROCK;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public RockPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.NORMAL);
		}
	}

}
