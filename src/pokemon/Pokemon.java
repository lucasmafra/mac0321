package pokemon;

import java.util.HashMap;
import java.util.Map;

public abstract class Pokemon {
	
	public static final int MAX_ATTACKS = 4;
	private String name;
	private int currentHp;
	private int maxHp;
	private PokemonAttack[] attacks = new PokemonAttack[MAX_ATTACKS];
	private PokemonType type;
	// Maps opponent types to the effectiveness of an against them.
	private static final Map<PokemonType, Integer> effectivenessMap = 
			new HashMap<PokemonType, Integer>();
	
	public Pokemon(String pokemonName, int maximumHp, PokemonAttack[] attacks) {
		this.name = pokemonName;
		this.maxHp = maximumHp;
		this.currentHp = maximumHp;
		this.attacks = attacks;
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return currentHp;
	}
	public boolean heal(int hp) {
		if (currentHp == maxHp)
			return false;
		else {
			if (currentHp + hp < maxHp)
				currentHp+= hp;
			else
				currentHp = maxHp;
			return true;
		}
	}
	public boolean damage(int dmg) {
		if (currentHp == 0)
			return false;
		else {
			if (currentHp - dmg < 0) 
				currentHp -= dmg;
			else
				currentHp = 0;
			return true;
		}
	}
	public int getMaxHp() {
		return maxHp;
	}
	public PokemonType getType() {
		return type;
	}
	
	public PokemonAttack[] getAttacks() {
		return attacks;
	}
	public int getAttackDamage(int attackIndex) {
		if (attackIndex > MAX_ATTACKS) {
			//TODO Treat IndexOutOfBoundsException
		}
		return attacks[attackIndex].getBaseDamage();
	}
	public int getAttackAgility(int attackIndex) {
		if (attackIndex > MAX_ATTACKS) {
			//TODO Treat IndexOutOfBoundsException
		}
		return attacks[attackIndex].getAgility();
	}
	public String getAttackName(int attackIndex) {
		if (attackIndex > MAX_ATTACKS) {
			//TODO Treat IndexOutOfBoundsException
		}
		return attacks[attackIndex].getName();
	}
	
	// Returns the effectiveness multiplier for an attack against an enemy Pokémon of type oponentType. 
	// (0 for No effect, 50 for Not very effective, 100 for Normal, and 200 for Super-effective.
	public int getEffectivenessAgainst(PokemonType oponentType) {
		return effectivenessMap.get(oponentType);
	}
}
