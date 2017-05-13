package pokemon;

import java.util.EnumMap;
import java.util.Map;

public abstract class Pokemon {

	public static final int MAX_ATTACKS = 4;
	private String name;
	private int currentHp;
	private int maxHp;
	private PokemonAttack[] attacks = new PokemonAttack[MAX_ATTACKS];
	private PokemonType type;
	private static final Map<PokemonType, Effectiveness> effectivenessMap = new EnumMap<PokemonType, Effectiveness>(
			PokemonType.class);

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
				currentHp += hp;
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
			// TODO Treat IndexOutOfBoundsException
		}
		return attacks[attackIndex].getBaseDamage();
	}

	public int getAttackAgility(int attackIndex) {
		if (attackIndex > MAX_ATTACKS) {
			// TODO Treat IndexOutOfBoundsException
		}
		return attacks[attackIndex].getAgility();
	}

	public String getAttackName(int attackIndex) {
		if (attackIndex > MAX_ATTACKS) {
			// TODO Treat IndexOutOfBoundsException
		}
		return attacks[attackIndex].getName();
	}

	public Effectiveness getEffectivenessAgainst(PokemonType opponentType) {
		return effectivenessMap.get(opponentType);
	}
}
