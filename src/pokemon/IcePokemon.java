package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class IcePokemon extends Pokemon {

	private static final PokemonType type = PokemonType.ICE;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public IcePokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.SUPER_EFFECTIVE);
		}
	}

}
