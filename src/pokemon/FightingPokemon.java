package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class FightingPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.FIGHTING;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public FightingPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.NOT_VERY_EFFECTIVE);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.NO_EFFECT);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.NORMAL);
		}
	}

}
