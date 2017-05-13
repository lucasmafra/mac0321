package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class ElectricPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.ELECTRIC;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public ElectricPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.NO_EFFECT);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.NOT_VERY_EFFECTIVE);
		}
	}

}
