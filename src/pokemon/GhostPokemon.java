package pokemon;

import java.util.EnumMap;
import java.util.Map;

public class GhostPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.GHOST;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

	public GhostPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, Effectiveness.NO_EFFECT);
			effectivenessMap.put(PokemonType.FIRE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.WATER, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ELECTRIC, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GRASS, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ICE, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FIGHTING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.POISON, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GROUND, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.FLYING, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.PSYCHIC, Effectiveness.NO_EFFECT);
			effectivenessMap.put(PokemonType.BUG, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.ROCK, Effectiveness.NORMAL);
			effectivenessMap.put(PokemonType.GHOST, Effectiveness.SUPER_EFFECTIVE);
			effectivenessMap.put(PokemonType.DRAGON, Effectiveness.NORMAL);
		}
	}

}
