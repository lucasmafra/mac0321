package pokemon;

import java.util.HashMap;
import java.util.Map;

public abstract class Pokemon {
	
	public static final int MAX_ATTACKS = 4;
	private String name;
	private int currentHp;
	private int maxHp;
	private PokemonAttack[] attacks = new PokemonAttack[MAX_ATTACKS];
	private PokemonTypes type;
	private static final Map<PokemonTypes, Integer> effectivenessMap = 
			new HashMap<PokemonTypes, Integer>();
	
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
	public String getType() {
		return type.toString();
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
	
	public int getEffectivenessAgainst(String oponentType) {
		return effectivenessMap.get(PokemonTypes.valueOf(oponentType.toUpperCase()));
	}

	public void setHp(int value) {
		this.currentHp += value;
		if (this.currentHp > this.maxHp) //evita ficar com valor inconsistente de HP
			this.currentHp = this.maxHp;
		
		if (this.currentHp < 0) //evita ficar com valor inconsistente de HP
			this.currentHp = 0; 
			
	}
}
