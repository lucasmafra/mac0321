package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class FirePokemon extends Pokemon {

	private static final PokemonType type = PokemonType.FIRE;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public FirePokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.NOT_VERY_EFFECTIVE);
		}
	}

}
