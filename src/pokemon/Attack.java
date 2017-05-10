package pokemon;

public class Attack {
	
	private String name;
	private int baseDamage;
	private int agility;

	public Attack(String attackName, int damage, int attackAgility) {
		this.name = attackName;
		this.baseDamage = damage;
		this.agility = attackAgility;
	}
	
	public String getName() {
		return name;
	}
	public int getBaseDamage() {
		return baseDamage;
	}
	public int getAgility() {
		return agility;
	}
}
