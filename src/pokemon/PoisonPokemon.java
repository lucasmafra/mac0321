package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class PoisonPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.POISON;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public PoisonPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.NORMAL);
		}
	}

}
