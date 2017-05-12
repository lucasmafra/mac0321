package pokemon;

import java.util.HashMap;
import java.util.Map;

public class DragonPokemon extends Pokemon {

	private static final PokemonType type = PokemonType.DRAGON;
	private static final Map<PokemonType, Integer> effectivenessMap = new HashMap<PokemonType, Integer>();

	public DragonPokemon(String pokemonName, int maximumHp, PokemonAttack attacks[]) {
		super(pokemonName, maximumHp, attacks);
		if (effectivenessMap.isEmpty()) {
			effectivenessMap.put(PokemonType.NORMAL, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIRE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.WATER, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ELECTRIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GRASS, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ICE, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FIGHTING, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.POISON, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GROUND, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.FLYING, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.PSYCHIC, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.BUG, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.ROCK, 		Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.GHOST, 	Effectiveness.NORMAL.getValue());
			effectivenessMap.put(PokemonType.DRAGON, 	Effectiveness.SUPER_EFFECTIVE.getValue());
		}
	}

}
