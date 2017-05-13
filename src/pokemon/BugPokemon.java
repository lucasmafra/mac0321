package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class BugPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.BUG;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public BugPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.NORMAL);
		}
	}

}
